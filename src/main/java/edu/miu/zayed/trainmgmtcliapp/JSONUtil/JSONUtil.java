package edu.miu.zayed.trainmgmtcliapp.JSONUtil;

import edu.miu.zayed.trainmgmtcliapp.model.Passenger;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUtil {

    public static String convertListToJSON(List<Passenger> passengers) {
        JSONArray jsonArray = new JSONArray();
        passengers.forEach(passenger -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("passengerId", passenger.getPassengerId());
            jsonObject.put("firstName", passenger.getFirstName());
            jsonObject.put("lastName", passenger.getLastName());
            jsonObject.put("phoneNumber", passenger.getPhoneNumber());
            jsonObject.put("dateOfBirth", passenger.getDateOfBirth());
            jsonObject.put("trainStation", passenger.getTrainStation());
            jsonObject.put("dateTimeBoarded", passenger.getDateTimeBoarded()); // Fixed case
            jsonArray.put(jsonObject);
        });
        return jsonArray.toString(2);
    } // Removed semicolon here
}