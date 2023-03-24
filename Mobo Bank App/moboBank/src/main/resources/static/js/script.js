$(document).ready(function() {

    // Listen to the form submit event
    $("#balance-form").submit(function(event) {
        event.preventDefault(); // Prevent the default form submit behavior
        var form = $(this); // Get the form element
        var url = form.attr("action"); // Get the API endpoint URL
        var data = form.serialize(); // Serialize the form data into a query string

        // Send an AJAX POST request to the API endpoint
        $.post(url, data, function(response) {
            // Update the account name and balances in the web interface
            $("#account-name").text(response.accountName);
            $("#actual-balance").text("Actual Balance: " + response.actualBalance);
            $("#available-balance").text("Available Balance: " + response.availableBalance);
            // Show the balance container
            $("#balance-container").show();
        });
    });
});
