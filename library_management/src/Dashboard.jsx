import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './index.css';
import Bot from './Bot';

function Dashboard() {
  const [dropdownOpen, setDropdownOpen] = useState(false);
  const navigate = useNavigate();

  const toggleDropdown = () => setDropdownOpen(!dropdownOpen);

  const handleLogout = () => {
    navigate('/');
  };

  return (
    <div className="app-container">
      
      <div className="sidebar">
        <div className="logo">Book4all</div>
        <div className="nav-item">🏠 Home</div>
        <div className="nav-item">🔍 Search</div>
        <div className="nav-item">📊 My Shelf</div>
        <div className="nav-item">📚 Contribute</div>
      </div>

      <div className="main">
        <div className="topbar">
          <div className="search-bar">
            <select>
              <option>All</option>
              <option>Books</option>
              <option>Authors</option>
            </select>
            <input type="text" placeholder="Search" />
          </div>

          <div className="controls">
            <button>🔍</button>

            <div className="relative profile-dropdown">
              <div className="profile-bar" onClick={toggleDropdown}>
                <img src="profile.jpg" alt="User" />
                <span className="username">Aishu</span>
                <span className="dropdown-icon">▼</span>
              </div>

              {dropdownOpen && (
                <div className="dropdown-menu">
                  <div className="dropdown-item">Profile</div>
                  <div className="dropdown-item">Favourite</div>
                  <div className="dropdown-item">Payments</div>
                  <div className="dropdown-item" onClick={handleLogout}>Logout</div>
                </div>
              )}
            </div>

            <button>🔔</button>
          </div>
        </div>

        <h2 className="greeting">Good Morning</h2>
        <h4 className="subheading">Recommended for You</h4>

        <div className="book-grid">
          <div className="book-card"><img src="book1.jpg" /></div>
          <div className="book-card"><img src="book2.jpg" /></div>
          <div className="book-card"><img src="book3.jpg" /></div>

          <div className="book-card"><img src="book7.jpg" /></div>
          <div className="book-card"><img src="book8richdad.jpg" /></div>
          <div className="book-card"><img src="book9.jpg" /></div>

          <div className="book-card"><img src="book10.jpg" /></div>
          <div className="book-card"><img src="book11.jpg" /></div>
          <div className="book-card"><img src="book12.jpg" /></div>
        </div>

      </div>

      <Bot />
    </div>
  );
}

export default Dashboard;
