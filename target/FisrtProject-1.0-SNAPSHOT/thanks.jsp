<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="main.css">
    <title>Survey - Thanks</title>
</head>
<body>
    <div class="container">
        <div class="header">
            <img src="rtic-logo.png" alt="RTIC Logo" class="logo">
            <h1>Thanks for completing our survey</h1>
            <p class="subtitle">Here is the information that you entered:</p>
        </div>

        <div class="info-list">
            <div class="info-row">
                <span class="info-label">First Name:</span>
                <span class="info-value">${user.firstName}</span>
            </div>

            <div class="info-row">
                <span class="info-label">Last Name:</span>
                <span class="info-value">${user.lastName}</span>
            </div>

            <div class="info-row">
                <span class="info-label">Email:</span>
                <span class="info-value">${user.email}</span>
            </div>

            <div class="info-row">
                <span class="info-label">Date of Birth:</span>
                <span class="info-value">${user.dateOfBirth}</span>
            </div>

            <div class="info-row">
                <span class="info-label">How did you hear about us:</span>
                <span class="info-value">${user.source}</span>
            </div>

            <div class="info-row">
                <span class="info-label">Would you like to receive announcements:</span>
                <span class="info-value">${user.announcements ? "Yes" : "No"}</span>
            </div>

            <div class="info-row">
                <span class="info-label">Send me email announcements:</span>
                <span class="info-value">${user.emailAnnouncements ? "Yes" : "No"}</span>
            </div>

            <div class="info-row">
                <span class="info-label">Please contact me by:</span>
                <span class="info-value">${user.contact}</span>
            </div>
        </div>

        <p class="thank-note">Thank you for taking the time to complete our survey.</p>
        <p class="return-note">To enter another survey, click the Return button below.</p>

        <form action="surveyListServlet" method="get" class="form-actions">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return" id="submit">
        </form>
    </div>
</body>
</html>
