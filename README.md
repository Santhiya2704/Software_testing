# Software_testing
## Project Report: Automated LinkedIn Navigation and Search with Filtering

**Problem Statement:**

Manually navigating and searching for jobs, skills, and courses on LinkedIn can be a time-consuming and repetitive task. This project aims to automate basic functionalities with an added layer of filtering job searches by employment type (e.g., Full-time).

**Desired Outcome:**

This script automates the following actions on LinkedIn:

* Launch the website.
* Simulate user interactions for specific tasks:
    * **Job Search:** 
        * Navigate to the Jobs section.
        * Search for jobs based on a keyword.
        * Apply a filter for employment type (e.g., click "Full-time").
    * **Skill Search:** 
        * Navigate to the Learning section.
        * Search for skills using a keyword.
    * **Course Exploration (Limited Interaction):** 
        * Click on a specific course title within the search results.
        * Click on the "Preview" button to launch the course preview video.

**Benefits:**

* **Increased Efficiency:** Automating search and navigation tasks can significantly save time for users who frequently perform these actions on LinkedIn.
* **Reduced Errors:** Automating repetitive tasks minimizes the chance of human error while searching and applying filters.

**Assumptions:**

* The user has a web browser and a valid internet connection.
* The user has downloaded and installed the appropriate ChromeDriver for their operating system.
* The script interacts with the current structure of the LinkedIn website. Modifications might be needed if the website layout changes significantly.

**Project Title:** Automated LinkedIn Navigation and Search with Filtering

**Project Description:**

This project developed a Java program using Selenium WebDriver to automate basic navigation and search functionalities on LinkedIn with an additional feature to apply a filter during job searches. The script simulates user actions to launch the website, navigate to specific sections (Jobs, Learning), perform keyword searches, apply a filter for job type, and access course previews.

**Methodology:**

* The script utilizes the ChromeDriver to interact with the Chrome web browser.
* It leverages Selenium WebDriver libraries to automate web page interactions.
* The code employs best practices like explicit waits (WebDriverWait) for handling dynamic elements, improving reliability compared to `Thread.sleep`.


**Results (based on the provided code snippet):**

* The script successfully navigates to the LinkedIn website.
* It interacts with the Jobs section and performs a search using a provided keyword.
* The script clicks a button to open the filter menu for job searches.
* It clicks a checkbox to filter jobs by employment type (assuming the element name matches the code).
* The script clicks a button to confirm the filter selection.
* It navigates back to the LinkedIn homepage.
* The script navigates to the Learning section and performs a skill search based on another keyword.
* It clicks on a specific course title within the search results.
* The script clicks on the "Preview" button to launch the course preview video (limited interaction).

**Limitations:**

* The script currently relies on XPath expressions for element identification, which might break if the website structure changes.
* The provided code snippet doesn't implement login functionality or complete job search features (applying additional filters).
* Course interaction is limited to clicking a title and clicking the "Preview" button.

**Future Work:**

* Implement robust error handling mechanisms to address potential issues (e.g., element not found).
* Consider using a Page Object Model (POM) for better code organization and maintainability.
* Enhance the job search functionality by incorporating additional filter options.
* Develop further interaction with course previews or other elements within the Learning section.

**Conclusion:**

This project establishes a foundation for automating basic navigation and search tasks on LinkedIn, including applying filters during job searches. By addressing the limitations and incorporating best practices, the script can evolve into a valuable tool for users who frequently perform these actions on the platform. It's crucial to use the script ethically and responsibly, adhering to LinkedIn's Terms of Service.
