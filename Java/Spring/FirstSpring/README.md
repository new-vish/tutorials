# FirstSpring
Simple "Hello" bean
Notes:

When `ClassPathXmlApplicationContext` is used to load application context (applicationContext.xml), the file specified should be available as _resource_.

In Eclipse, I did not find a way to denote whether given folder is resource folder (even though it's name might be `resource`).

The way Java\Spring seems to search for resource is as follows:

1. Get each source folder (listed under Project -> Configure -> Configure Build Path -> Source Folder)
2. Add relative resource path specified as part of file path.
3. Try to load

Because of scheme above, it important to have starting forward slash i.e. `/applicationContext.xml`.

If exception thrown and inner exception is `FileNotFoundException`, **one of the way** it can be diagnosed is to try to load applicationContext.xml as resource by separate code ( `spring.tutorials.first.spring.tests.Test.main`)
