package com.jproject.navergeo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileJavaJsonTest {
    public static void main(String[] args) throws Exception{
        // 만약 외부에서 네트워크를 통해 json을 가져왔다고 생각하면~
        String src = "test.json";

        BufferedInputStream bs = new BufferedInputStream(new FileInputStream(new File(src)));

        JSONTokener jt = new JSONTokener(bs);
        JSONObject jo = new JSONObject(jt);

        JSONArray jr = jo.getJSONArray("students");
        System.out.println(jr);
    }
}
