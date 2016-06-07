# g3_1_x_mapping
Demo showing broken UrlMappings in production mode in Grails 3.1.1 vs 3.1.8

Running this application in Production (-Dgrails.env=prod) and generated war with Grails 3.1.8 do not respect the UrlMappings correctly. 

Url mappings seem to work correctly while running in Development (-Dgrails.env=dev) with Grails 3.1.8.

Running this application with Grails 3.1.1 works with all environments and compiled war.

## Testing ##

I use an _Application_ Run Configuration in IntelliJ pointing to the SpringBoot g3_1_x_mapping.Application entry class and pass the -Dgrails.env to test scenarios. 

I also change the gradle.properties "grailsVersion" to switch between 3.1.1 and 3.1.18.