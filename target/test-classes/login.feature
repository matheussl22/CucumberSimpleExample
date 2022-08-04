Feature: Web Login
  Scenario: Check login is successful with valid credentials
    Given the user access page "https://www.youtube.com.br"
    When the user do search "Post Malone"
