import React, { useState, useEffect } from "react";
import { googleLogout, useGoogleLogin } from "@react-oauth/google";
import axios from "axios";
import { Link } from "react-router-dom";

function Login({ userId, setUserId, setInApp }) {
  const [googleSSOUser, setGoogleSSOUser] = useState([]);
  const [googleSSOProfile, setGoogleSSOProfile] = useState(null);
  const [birthday, setBirthday] = useState("2000-01-01");
  const [userCreated, setUserCreated] = useState(false);

  const login = useGoogleLogin({
    onSuccess: (codeResponse) => setGoogleSSOUser(codeResponse),
    onError: (error) => console.log("Login Failed:", error),
  });

  useEffect(() => {
    if (googleSSOUser) {
      axios
        .get(
          `https://www.googleapis.com/oauth2/v1/userinfo?access_token=${googleSSOUser.access_token}`,
          {
            headers: {
              Authorization: `Bearer ${googleSSOUser.access_token}`,
              Accept: "application/json",
            },
          }
        )
        .then((res) => {
          setGoogleSSOProfile(res.data);
        })
        .catch((err) => console.log(err));
    }
  }, [googleSSOUser]);

  // log out function to log the user out of google and set the profile array to null
  const logOut = () => {
    googleLogout();
    setGoogleSSOProfile(null);
  };

  const handleCreateUser = () => {
    const a = {
      name: googleSSOProfile.name,
      dateOfBirth: birthday,
      email: googleSSOProfile.email,
      password: "defualt",
      profilePictureUrl: googleSSOProfile.picture,
    }
    console.log(a)
    axios
      .put(
        `http://ec2-18-224-179-229.us-east-2.compute.amazonaws.com:8012/api/v1/users`,
        {
          name: googleSSOProfile.name,
          dateOfBirth: birthday,
          email: googleSSOProfile.email,
          password: "defualt",
          profilePictureUrl: googleSSOProfile.picture,
        }
      )
      .then((res) => {
        if (JSON.stringify(res.status) == "200") {
          setUserId(res.data);
          setUserCreated(true);
        }
      })
      .catch((err) => console.log(err));
  };

  return (
    <div>
      <h2>ConcertBuddy Google SSO Login</h2>
      <br />
      <br />
      {googleSSOProfile ? (
        <div>
          <h3>{googleSSOProfile.name} Logged in</h3>
          <br />
          <p>Enter your birthday to get started with ConcertBuddy</p>
          <input
            type="text"
            className="form-control"
            placeholder="e.g. 2000-01-01"
            value={birthday}
            onChange={(e) => setBirthday(e.target.value)}
          />
          <button
            className="btn btn-primary"
            onClick={handleCreateUser}
          >
            Submit Birthday
          </button>
          {userCreated && (
            <div className="mt-3">
              <Link to="/userDetails">
                <button className="btn btn-primary" onClick={() => {setInApp(true)}}>Get Started</button>
              </Link>
            </div>
          )}
          <br />
          <br />
          <br />
          <button className="btn btn-primary" onClick={logOut}>Log out</button>
        </div>
      ) : (
        <button className="btn btn-primary" onClick={() => login()}>Sign in with Google SSO </button>
      )}
    </div>
  );
}

export default Login;
