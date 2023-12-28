import React, { useState, useEffect } from "react";
import {
  MDBCol,
  MDBContainer,
  MDBRow,
  MDBCard,
  MDBCardText,
  MDBCardBody,
  MDBCardImage,
  MDBBtn,
  MDBBreadcrumb,
  MDBBreadcrumbItem,
  MDBProgress,
  MDBProgressBar,
  MDBIcon,
  MDBListGroup,
  MDBListGroupItem,
} from "mdb-react-ui-kit";
import axios from "axios";
import { Link } from "react-router-dom";

export default function ConcertDetails({concertId, userId, setMatchedUserIds}) {
  const [concert, setConcert] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const [isMatching, setIsMatching] = useState(false);
  const [matchStatus, setMatchStatus] = useState("");
  const [successfullyMatched, setSuccessfullyMatched] = useState(false);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const concertResponse = await fetch(
          "https://concertbuddyconcert.uc.r.appspot.com/api/v1/concerts/" + concertId
        );
        const concertData = await concertResponse.json();
        setConcert(concertData); // Assuming concertData is a Concert object
        setIsLoading(false);
      } catch (error) {
        console.error("Error fetching data:", error);
        setIsLoading(false);
      }
    };

    fetchData();
  }, []);

  const handleMatch = async () => {
    try {
      setIsMatching(true)
      const url =
        "http://ec2-18-224-179-229.us-east-2.compute.amazonaws.com:8013/api/v1/finder/" + userId + "/" + concertId;

      const res = await axios.post(url, null, null);
      if (JSON.stringify(res.status) == "200") {
        setMatchStatus("Success");
        setSuccessfullyMatched(true)
        setMatchedUserIds(res.data.matchedUserId)
      } else {
        settMatchStatus("Fail");
      }
      setIsMatching(false)
    } catch (error) {
      console.error("Error:", error);
      // Handle errors here
    }
  };

  return (
    <div>
      {isLoading ? (
        <p>Loading...</p>
      ) : (
        <section style={{ backgroundColor: "#eee" }}>
          <MDBContainer className="py-5">

            <MDBRow>
              <MDBCol lg="4">
                <MDBCard className="mb-4">
                  <MDBCardBody className="text-center">
                    <MDBCardImage
                      src={process.env.PUBLIC_URL + "/Home.jpg"}
                      alt="avatar"
                      className="rounded-circle"
                      style={{ width: "150px" }}
                      fluid
                    />
                    <p className="text-muted mb-1">Concert</p>
                  </MDBCardBody>
                </MDBCard>

                <MDBCard className="mb-4 mb-lg-0">
                  <MDBCardBody className="p-0">
                    <MDBListGroup flush className="rounded-3">
                      <MDBListGroupItem className="d-flex justify-content-between align-items-center p-3">
                        <i class="fas fa-rocket fa-3x" />
                        <div>
                          <button
                            className="btn btn-primary"
                            onClick={handleMatch}
                          >
                            Match
                          </button>
                          {isMatching && (<p>Matching...</p>)}
                          {matchStatus && (
                            <div className="mt-3">
                              <strong>SpotifySync Status:</strong>
                              <pre>{matchStatus}</pre>
                              {successfullyMatched && (
                                <Link to="/userList">
                                  <button className="btn btn-primary">View Matched Users</button>
                                </Link>
                              )}
                            </div>
                          )}
                        </div>
                      </MDBListGroupItem>
                    </MDBListGroup>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol lg="8">
                <MDBCard className="mb-4">
                  <MDBCardBody>
                    <MDBRow>
                      <MDBCol sm="3">
                        <MDBCardText>Name</MDBCardText>
                      </MDBCol>
                      <MDBCol sm="9">
                        <MDBCardText className="text-muted">
                          {concert.name}
                        </MDBCardText>
                      </MDBCol>
                    </MDBRow>
                    <hr />
                    <MDBRow>
                      <MDBCol sm="3">
                        <MDBCardText>Venue</MDBCardText>
                      </MDBCol>
                      <MDBCol sm="9">
                        <MDBCardText className="text-muted">
                          {concert.venue}
                        </MDBCardText>
                      </MDBCol>
                    </MDBRow>
                    <hr />
                    <MDBRow>
                      <MDBCol sm="3">
                        <MDBCardText>PerformingArtist</MDBCardText>
                      </MDBCol>
                      <MDBCol sm="9">
                        <MDBCardText className="text-muted">
                          {concert.performingArtist}
                        </MDBCardText>
                      </MDBCol>
                    </MDBRow>
                    <hr />
                    <MDBRow>
                      <MDBCol sm="3">
                        <MDBCardText>Date</MDBCardText>
                      </MDBCol>
                      <MDBCol sm="9">
                        <MDBCardText className="text-muted">
                          {concert.dateTime}
                        </MDBCardText>
                      </MDBCol>
                    </MDBRow>
                    <hr />
                    <MDBRow>
                      <MDBCol sm="3">
                        <MDBCardText>Genre</MDBCardText>
                      </MDBCol>
                      <MDBCol sm="9">
                        <MDBCardText className="text-muted">
                          {concert.genre}
                        </MDBCardText>
                      </MDBCol>
                    </MDBRow>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
            </MDBRow>
          </MDBContainer>
        </section>
      )}
    </div>
  );
}
