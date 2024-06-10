# Screen Smart Weather App


## Purpose

The goal of the Screen Smart Weather App is to give people a simple way to track and manage their daily screen usage. Users who want to determine their average screen time and track their daily screen usage over a week can use this programme. Created for a nearby meteorological organisation, the application integrates data entry, error management, and in-depth views to guarantee a thorough user experience.


## Background

An app that provides comprehensive information for each day in addition to the average screen time for the week has been requested by the local meteorological organisation. The intention is to give users a tool to effectively manage weekly screen time data by using loops, arrays, and screen navigation. To satisfy these needs, the programme has three main screens: a splash screen, a main screen, and a detailed view screen.


## Features

### 1. Splash Screen

- **Purpose**: The app's welcome screen greets users..
- **Content**:
  - displays the app's name.
  - Shows the developer's name and student number.
  - Includes the app's logo.
  - Provides options to navigate to the Main screen or exit the app.
- **Navigation**:
  - **Enter Button**: Takes the user to the Main screen.
  - **Exit Button**: Closes the application.
 
  ### 2. Main Screen
- **Purpose**: Allows users to input daily screen times.
- **Content**:
  - Input fields for each day of the week.
  - Buttons for adding data, clearing inputs, and viewing detailed information.
- **Functionality**:
  - **Add Button**: Stores user input into parallel arrays and displays a success message. Handles invalid input by displaying an error message.
  - **Clear Button**: Clears all input fields to allow re-entry of data.
  - **View Details Button**: Navigates to the Detailed View screen.

### 3. Detailed View Screen
- **Purpose**: Displays detailed screen time data and calculates the average screen time for the week.
- **Content**:
  - Text views showing screen times for each day.
  - A text view displaying the calculated average screen time.
  - A back button to return to the Main screen.
- **Functionality**:
  - Calculates and displays the average screen time using data stored in arrays.
  - Ensures navigation back to the Main screen.

## Data Storage
The application stores the screen times for every day of the week using parallel arrays. Because every array member is associated with a certain day, the data is arranged and readily available for computation and visualisation.

## Error Handling
he application has error-handling features to guarantee a seamless user experience:
- **Input Validation**: verify that numbers entered by users are valid when they enter screen times. A toast message alerts the user to submit valid numbers if invalid input is found.
- **Clear Feedback**: gives users feedback when data is successfully added or when input fields are cleared.

## Conclusion
The Screen Smart Weather App offers a powerful tool for monitoring and analysing daily screen periods, which efficiently satisfies the needs of the local weather organisation.


## Screens and Error messages

![FinalPoe1](https://github.com/CingimisoFodo/weatherApp/assets/128706433/03c85974-891b-4c7e-9d1c-d2305978243b)
![FinalPoe2](https://github.com/CingimisoFodo/weatherApp/assets/128706433/9bb712c5-c248-4b9c-bf56-00bdfee51d90)
![FinalPoe3](https://github.com/CingimisoFodo/weatherApp/assets/128706433/2dd94c38-f7ef-4938-8205-6a2a12f1c61b)
![FinalPoe4](https://github.com/CingimisoFodo/weatherApp/assets/128706433/78229efc-8503-446b-8ab7-d1e381873255)
![FinalPoe5](https://github.com/CingimisoFodo/weatherApp/assets/128706433/1632df22-92b5-4b67-b190-840e734ee2aa)


## A link to Github repository
