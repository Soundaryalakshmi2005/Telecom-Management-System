document.addEventListener("DOMContentLoaded", function () {
  var loginForm = document.getElementById("loginForm");
  var errorMsg = document.getElementById("error");

  loginForm.addEventListener("submit", function (e) {
    e.preventDefault();

    var username = document.getElementById("username").value.trim();
    var password = document.getElementById("password").value.trim(); // not used yet

    fetch("http://localhost:8080/api/users", { method: "GET" })
      .then(function (response) {
        if (!response.ok) {
          throw new Error("Network response was not ok");
        }
        return response.json();
      })
      .then(function (users) {
        var foundUser = users.find(function (u) {
          return u.role.toLowerCase() === username.toLowerCase();
        });

        if (foundUser) {
          alert("✅ Login Successful as " + foundUser.role);
		  window.location.href = "dashboard.html";
        } else {
          errorMsg.textContent = "❌ Invalid username (use Admin, Manager, or Staff)";
        }
      })
      .catch(function (err) {
        console.error("Login error:", err);
        errorMsg.textContent = "⚠️ Server error. Please try again.";
      });
  });
});
