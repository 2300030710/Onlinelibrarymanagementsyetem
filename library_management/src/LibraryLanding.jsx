import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./index.css";

export default function LibraryLanding() {
  const [showLoginModal, setShowLoginModal] = useState(false);
  const [showSignupModal, setShowSignupModal] = useState(false);
  const navigate = useNavigate();

  const [signupData, setSignupData] = useState({
    name: "",
    collegeId: "",
    role: "student",
    email: "",
    password: "",
    confirmPassword: "",
  });

  const [loginData, setLoginData] = useState({
    email: "",
    password: "",
  });

  const openLogin = () => {
    setShowSignupModal(false);
    setShowLoginModal(true);
  };

  const openSignup = () => {
    setShowLoginModal(false);
    setShowSignupModal(true);
  };

  const closeModal = () => {
    setShowLoginModal(false);
    setShowSignupModal(false);
  };

  const handleSignupChange = (e) => {
    const { name, value } = e.target;
    setSignupData((prev) => ({ ...prev, [name]: value }));
  };

  const handleLoginChange = (e) => {
    const { name, value } = e.target;
    setLoginData((prev) => ({ ...prev, [name]: value }));
  };

  const handleSignupSubmit = async (e) => {
    e.preventDefault();

    if (signupData.password !== signupData.confirmPassword) {
      alert("Passwords do not match!");
      return;
    }

    const payload = {
      fullname: signupData.name,
      email: signupData.email,
      password: signupData.password,
    };

    try {
      const response = await fetch("http://localhost:8081/users/signup", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(payload),
      });

      const data = await response.json();

      if (data.success) {
        alert("Signup Successful!");
        closeModal();
      } else {
        alert("Signup failed: " + data.message);
      }
    } catch (err) {
      alert("Backend error: " + err.message);
    }
  };

  const handleLoginSubmit = async (e) => {
    e.preventDefault();

    const payload = {
      email: loginData.email,
      password: loginData.password,
    };

    try {
      const response = await fetch("http://localhost:8081/users/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(payload),
      });

      const data = await response.json();

      if (data.success) {
        alert("Login Successful!");
        closeModal();
        navigate("/dashboard");
      } else {
        alert("Login failed: " + data.message);
      }
    } catch (err) {
      alert("Backend error: " + err.message);
    }
  };

  return (
    <div className="container">

      <header className="header">
        <div className="logo">📖 Book4all</div>
        <nav className="nav">
          <ul>
            <li>Home</li>
            <li>Catalog</li>
            <li>Events</li>
            <li>Contact</li>
          </ul>
        </nav>

        <div className="button-group">
          <button className="login-btn" onClick={openLogin}>Login</button>
          <button className="signup-btn" onClick={openSignup}>Sign Up</button>
        </div>
      </header>

      <section className="hero">
        <h1>Welcome to Our Digital Library</h1>
        <p>Explore thousands of books & resources.</p>
        <button onClick={openLogin}>Start Reading 📚</button>
      </section>

      {/* LOGIN MODAL */}
      {showLoginModal && (
        <div className="modal-overlay" onClick={closeModal}>
          <div className="modal-box" onClick={(e) => e.stopPropagation()}>
            <h2>Login</h2>
            <form onSubmit={handleLoginSubmit}>
              <input type="email" name="email" placeholder="Email" value={loginData.email} onChange={handleLoginChange} required />
              <input type="password" name="password" placeholder="Password" value={loginData.password} onChange={handleLoginChange} required />
              <button type="submit" className="submit-btn">Login</button>
            </form>
            <p>Don't have an account? <span className="link" onClick={openSignup}>Sign Up</span></p>
          </div>
        </div>
      )}

      {/* SIGNUP MODAL */}
      {showSignupModal && (
        <div className="modal-overlay" onClick={closeModal}>
          <div className="modal-box" onClick={(e) => e.stopPropagation()}>
            <h2>Create Account</h2>
            <form onSubmit={handleSignupSubmit}>
              <input name="name" placeholder="Full Name" onChange={handleSignupChange} value={signupData.name} required />
              <input name="collegeId" placeholder="College ID" onChange={handleSignupChange} value={signupData.collegeId} required />
              <select name="role" value={signupData.role} onChange={handleSignupChange}>
                <option value="student">Student</option>
                <option value="faculty">Faculty</option>
                <option value="admin">Admin</option>
              </select>
              <input name="email" type="email" placeholder="Email" onChange={handleSignupChange} value={signupData.email} required />
              <input name="password" type="password" placeholder="Password" onChange={handleSignupChange} value={signupData.password} required />
              <input name="confirmPassword" type="password" placeholder="Confirm Password" onChange={handleSignupChange} value={signupData.confirmPassword} required />
              <button type="submit" className="submit-btn">Sign Up</button>
            </form>
            <p>Already have an account? <span className="link" onClick={openLogin}>Login</span></p>
          </div>
        </div>
      )}

    </div>
  );
}
