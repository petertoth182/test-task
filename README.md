# Exercise
1. Based on the provided user stories you can find at the end of this email, and after exploring the application, define relevant test cases you can come up with

2. Automate the defined test cases (black box, end to end tests) -you do not need to automate everything, just what you consider is worthy and can be accomplished in a reasonable time frame

3. Find as many bugs as possible and report them in the best way you can

# Solution
I chose to write test cases(feature file) for UserStory 2. I automated the first to scenarios using Serenity/Chromedriver/Java/Gradle

## Running tests

You need to set the path for Chromedriver in serenity.properties file:
`webdriver.chrome.driver = c:/path`<br />
eg.: `webdriver.chrome.driver = c:/chromedriver.exe`<br />

To run my scenarios tagged as 'solution' on Chrome:

`$ gradle clean test aggregate -Dcucumber.options="--tags @solution"`

## Reporting

View the report at target/site/serenity/index.html

