package data.json;

import data.constants.TestConst;

public class Inputdata {

    public String PetDataJSON()
    {
        String reqJson= "{ \n" +
                " \"id\" : "+ TestConst.ID +" , \n" +
                " \"category\" :{ \n" +
                " \"id\" : "+ TestConst.categoryID +" , \n" +
                " \"name\" : \""+ TestConst.CategoryName +" \" \n" +
                "}, \n" +
                " \"name\" : \""+ TestConst.name +" \" , \n" +
                " \"photoUrls\" : [ \n" +
                " \"String\" ] , \n" +
                " \"tags\" :[ \n" +
                "{ \n" +
                " \"id\" : "+ TestConst.tagID +" , \n" +
                " \"name\" : \""+ TestConst.tagName +" \" \n" +
                "} \n" +
                "] , \n" +
                " \"status\" : \""+ TestConst.Status +" \" \n" +
                "}";

return reqJson;
    }
}
