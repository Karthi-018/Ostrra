document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('loginForm');
    const messageElement = document.getElementById('message');
    const loginContainer = document.querySelector('.login-container');

    loginForm.addEventListener('submit', function(event) {
        event.preventDefault(); 

        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;

        if (username === "admin" && password === "Rest@123") {
            
            loginContainer.innerHTML = '<h1 class="welcome">Welcome</h1>';
        } else {
            messageElement.textContent = "Invalid username or password";
            messageElement.classList.remove('welcome');
            messageElement.classList.add('error');
            messageElement.style.display = 'block';
        }
    });

    loginForm.addEventListener('reset', function() {
        messageElement.style.display = 'none';
    });
});
