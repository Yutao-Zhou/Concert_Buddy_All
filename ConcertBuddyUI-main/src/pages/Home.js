import React from "react";
import { Link } from "react-router-dom";

const Home = () => {
  const styles = {
    backgroundImage: `url(${process.env.PUBLIC_URL}/Home.jpg)`,
    backgroundSize: "cover",
    backgroundPosition: "center",
    height: "100vh", // Adjust this according to your layout
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    color: "white", // Text color on top of the background
    textAlign: "center",
    // Add any other styles you need
  };

  const buttonStyle = {
    backgroundColor: "white", // Adjust button background color
    color: "black",
    border: "none",
  };

  return (
    <div style={styles}>
      <h1>ConcertBuddy</h1>
      <Link to="/login">
        <button className="btn btn-primary">Login</button>
      </Link>
    </div>
  );
};

export default Home;
