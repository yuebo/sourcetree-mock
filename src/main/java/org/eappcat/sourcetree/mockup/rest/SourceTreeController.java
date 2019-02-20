package org.eappcat.sourcetree.mockup.rest;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/1.0")
public class SourceTreeController {
    @GetMapping("/application-properties")
    public JSONObject applicationProperties(){
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("version","4.14.4");
        jsonObject.put("buildNumber","4014004");
        jsonObject.put("buildDate","1490571641513");
        jsonObject.put("displayName","Bitbucket");
        return jsonObject;
    }
    @GetMapping("/users/{user}")
    public JSONObject user(@PathVariable("user") String user){
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("name",user);
        jsonObject.put("displayName",user);
        jsonObject.put("slug",user);
        jsonObject.put("emailAddress",user.concat("@qq.com"));
        jsonObject.put("active",true);
        jsonObject.put("id",1);
        jsonObject.put("type","NORMAL");
        jsonObject.remove("links");
        return jsonObject;
    }
}
