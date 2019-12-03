# playlist_organizer_API
This API is a test project that demonstrates simple CRUD REST API for storing, deleting, requesting objects to and from the database.
Due to the usage of Hibernate framework this API is compatible with MySQL and also with MongoDB because all query methods will be
translated to mongo queries.

The manual on how to use this API can be displayed in the main route "/"
The URL is specified between " " and the attributes are marked with {}

Note: When creating a POST to store a object Artist that also includes a Track object, you have include the Track object JSON
stored inside Artist so than you can have an Artist with his Track object stored correctly. If you won't do so you will have only
Artist object with empty Track (which is not a problem). 

This API serves mainly as a refference for me as a reminder how to create som generic CRUD services.
If you have any ideas on how to enhance or improve this API let me know or fork the changes.
