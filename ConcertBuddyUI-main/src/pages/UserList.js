import React, { useState, useEffect } from "react";
import { MDBListGroup, MDBListGroupItem } from "mdb-react-ui-kit";
import { Link } from "react-router-dom";

const UserList = ({ userIds, setOtherUserId }) => {
  const [users, setUsers] = useState([]);
  const [isLoading, setIsLoading] = useState(true);

  const userUrl =
    "http://ec2-18-224-179-229.us-east-2.compute.amazonaws.com:8012";

  useEffect(() => {
    const fetchData = async () => {
      try {
        const promises = userIds.map(async (userId) => {
          const response = await fetch(`${userUrl}/api/v1/users/${userId}`);
          const data = await response.json();
          return data;
        });

        const userData = await Promise.all(promises);
        setUsers(userData);
        setIsLoading(false);
      } catch (error) {
        console.error("Error fetching data:", error);
        setIsLoading(false);
      }
    };

    fetchData();
  }, []);

  return (
    <div>
      {isLoading ? (
        <p>Loading...</p>
      ) : (
        <MDBListGroup>
          {users.map((user, index) => (
            <MDBListGroupItem key={index}>
              {/* Render user details here */}
              <Link to="/otherUserDetails" onClick={() => {setOtherUserId(user.id)}}>
                <h5>{user.name}</h5>
              </Link>
              <p>Age: {user.age}</p>
              {/* Add more details as needed */}
            </MDBListGroupItem>
          ))}
        </MDBListGroup>
      )}
    </div>
  );
};

export default UserList;
