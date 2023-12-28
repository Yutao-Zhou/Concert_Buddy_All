import { Outlet, Link } from "react-router-dom";

const Layout = ({inApp}) => {
  return (
    <>
      {inApp && (
        <nav>
          <ul>
            <li>
              <Link to="/userDetails">My Profile Details</Link>
            </li>
            <li>
              <Link to="/concertList">Explore Concerts</Link>
            </li>
          </ul>
        </nav>)}

      <Outlet />
    </>
  );
};

export default Layout;
