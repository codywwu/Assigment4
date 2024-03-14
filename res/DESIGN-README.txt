Overview:
The system allows for the creation and management of stock portfolios, querying stock information from external sources (like AlphaVantage), and calculating portfolio values on given dates, taking into account the highs and lows of stock prices.

Model
The Model component represents the system's data structure and business logic. It manages the data, rules, and controller instructions to update the view.

Objects Classes: Core data structures representing user's stocks and collections of stocks, respectively.
XMLDatabase Class: Manages data retrieval and parsing from XML files containing stock data, acting as an interface to external stock information sources.
Business Logic: Includes calculating total values of portfolios based on stock shares, handling date validations, and processing user inputs for portfolio and stock management.

View
The View component is responsible for presenting data to the user. It displays the user interface and visual representations of the model's data.

Console Output: The primary method of interaction, displaying portfolio information, stock details, and user prompts.
User Prompts: Collect user inputs for dates, portfolio selections, and other commands.


Controller
The Controller acts as an intermediary between the View and Model, handling user input and updating the View based on changes in the Model.

PortfolioManager Class: Handles user commands, interacts with the Model to retrieve or update data, and updates the View accordingly.
Input Validation and Parsing: Manages validation of user inputs, such as date checks, and parsing inputs to model operations.