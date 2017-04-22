# plugin.xml

The target generates ``plugin.xml`` with routes and renderers registrations. 
If ``plugin.xml`` was initially generated and has not been manually modified (its ``SHA-256`` digest hasn't changed since last generation), 
then the generator would overwrite the file. Otherwise it merges generated content with the existing ``plugin.xml`` by adding routes and renderers registrations which are not present in the existing file.    