package com.choucair.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class DataModel {
    private String required;
    private String email;
    private String password;
    private String confirmPassword;
    private String date;
    private String url;
    private String digits;
    private String range;

    public static List<DataModel> setData(DataTable dataTable) {
        List<DataModel> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            data.add(new ObjectMapper().convertValue(map, DataModel.class));
        }
        return data;
    }

}
