# Android Multiple File Selector Dialog



###Introduction

**Supports API 8(+)**

This is an Android Library file selector dialog.






```

To capture the result, use this method.

```java
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 0 && resultCode == RESULT_OK){
            ArrayList<File> Files = (ArrayList<File>) data.getSerializableExtra(FILES_TO_UPLOAD); //file array list
            String [] files_paths; //string array
            int i = 0;

            for(File file : Files){
                //String fileName = file.getName();
                String uri = file.getAbsolutePath();
                files_paths[i] = uri.toString(); //storing the selected file's paths to string array files_paths
                i++;
            }
        }else{
        }

	}

```

#### Folder Selector

To start folder selection activity,



###### Credits
Massive credit goes to Arian JM of Madrid who created the majority of this library. I do not have his contacts but he answered my question
Here is his profile on stackoverflow http://stackoverflow.com/users/3290971/arianjm
