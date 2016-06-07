# g3_1_x_mapping
Demo showing broken UrlMappings in production mode in Grails 3.1.1 vs 3.1.8

Grails 3.1.8 does not seem to be loading the correct GSP view for UrlMapping and Controller/Action combination. I'm seeing two different behaviors while in development mode (working correctly) vs production mode (broken).

In version 3.1.1 it seems to work as expected in development and production enviroments.

## Testing ##

### Steps to Reproduce

1. Edit `gradle.properties` and set `grailsVersion=3.1.8`
2. Run application in production mode
    `gradle bootRun -Dgrails.env=prod`
3. Browse to `http://localhost:8080`
4. Click through the four six links at bottom to test page and UrlMappings
5. Repeat steps 1-4 but change `grailsVersion=3.1.1` to see it working correctly in production mode

### Expected Behaviour

The URL path should match the correct controller/action defined in the UrlMappings.groovy.

The log output should show the correct controller/action defined for the requested URL.

The top page heading (H1) left is hardcoded to in the corresponding GSP should match the dynamic `params.namespace` / `params.controller` / `params.action` to the right of the "=".

### Actual Behaviour

In version 3.1.8, clicking through the links does not load the correct gsp for the route and controller in production mode, Although when booted in development mode it works as expected.

Version 3.1.1 works correctly in all environments.

### Environment Information

- **Operating System**: Mac OS X 10.11.4
- **Grails Version:** 3.1.8
- **JDK Version:** 1.8.0_92
- **Container Version (If Applicable):** N/A

### Example Application

- TODO: link to github repository with example that reproduces the issue

