import React, { useState, useEffect } from "react";
import { MDBListGroup, MDBListGroupItem } from "mdb-react-ui-kit";
import { Link } from "react-router-dom";

const ConcertList = ({setConcertId}) => {
  const [concerts, setConcerts] = useState([]);
  const [isLoading, setIsLoading] = useState(false);
  const [page, setPage] = useState(0);
  const [size, setSize] = useState(5);

  const handleGetConcerts = async () => {
    try {
      setIsLoading(true);
      const response = await fetch(
        "https://concertbuddyconcert.uc.r.appspot.com/api/v1/concerts?page=" + page + "&size=" + size
      );
      const data = await response.json();
      setConcerts(data); // Assuming data is an array of concert objects
      setIsLoading(false);
    } catch (error) {
      console.error("Error fetching data:", error);
      setIsLoading(false);
    }
  };

  return (
    <div>
      <input
        type="text"
        className="form-control"
        placeholder="page number"
        value={page}
        onChange={(e) => setPage(e.target.value)}
      />
      <input
        type="text"
        className="form-control"
        placeholder="page size"
        value={size}
        onChange={(e) => setSize(e.target.value)}
      />
      <button
        className="btn btn-primary"
        onClick={handleGetConcerts}
      >
        View Concerts
      </button>
      {isLoading ? (
        <p>Loading...</p>
      ) : (
        <MDBListGroup>
          {concerts.map((concert, index) => (
            <MDBListGroupItem key={index}>
              {/* Render concert details here */}
              <Link to="/concertDetails" onClick={() => {setConcertId(concert.id)}}>
                <h5>{concert.name}</h5>
              </Link>
              <p>Artist: {concert.performingArtist}</p>
              {/* Add more details as needed */}
            </MDBListGroupItem>
          ))}
        </MDBListGroup>
      )}
    </div>
  );
};

export default ConcertList;
