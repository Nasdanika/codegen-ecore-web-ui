# Resources

The generation process creates resource bundle property files used by the renderers. 
The property files contain UI customization properties from the generator model.

The generator keeps track of ``SHA-256`` digests of the files it generates and it "knows" 
if a particular file has been modified after generation. 
The generator overwrites files which weren't modified and updates the digest. If a file 
was modified, the generator merges generated properties into the file - it creates entries 
for properties which are not present in the existing file and keeps values of existing 
properties intact.   