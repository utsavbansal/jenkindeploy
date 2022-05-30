package com.Irrigation.SAIAFarming.utils;

public enum ResponseCode {
    SUCCESS(0, "Request succeeded"),
    //OK(200, "Accepted"),
    FAILED(1, "Request failed"),
    UNKNOWN(2, "Unknown"),
    SERVER_INTERNAL_SERVER_ERROR(501, "Internal_Server_error"),
    CLIENT_USER_ID_NOT_EXISTING(1012, "User_is_not_registered_please_register_the_user"),
    CLIENT_INVALID_REQ_PARAM_USER_NAME(1013,"Invalid_user_name"),
    CLIENT_INVALID_REQ_PARAM_GENDER(1014,"Invalid_gender"),
    CLIENT_INVALID_REQ_PARAM_RELATION(1015,"Invalid_Relation"),
    CLIENT_INVALID_REQ_PARAM_LITERACY(1016,"Invalid_education"),
    CLIENT_INVALID_REQ_PARAM_VILLAGE_NAME(1017,"Invalid_vilage_name"),
    CLIENT_INVALID_REQ_PARAM_ADDRESS_COORDINATES(1018,"Invalid_Address_Coordinates"),
    CLIENT_INVALID_REQ_PARAM_MOBILE_NUM(1019,"Invalid_Mobile_Number"),
    CLIENT_INVALID_REQ_PARAM_USER_TYPE(1020,"Invalid_User_Type"),
    CLIENT_INVALID_REQ_PARAM_USERID_PASSWORD(1034,"Invalid_username_or_password"),

    CLIENT_INVALID_REQ_PARAM_DATE(0000,"Invalid_date"),
    CLIENT_INVALID_REQ_PARAM_FARMER_ID(0000,"Invalid farmer Id"),
    CLIENT_INVALID_REQ_PARAM_FARM_SIZE(0000,"Invalid size of farm"),
    CLIENT_INVALID_REQ_PARAM_FARM_CATEGORY(0000,"Invalid farm size category"),
    CLIENT_INVALID_REQ_PARAM_FARM_ID(0000,"Invalid farm Id"),

    CLIENT_USER_MOBILE_EXISTING(1020, "Mobile_Number_already_In_Use,_please_register_with_different_Mobile_number");

    int code;
    String text;

    ResponseCode(int code, String text){
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }


    public String getText() {
        return text;
    }

    public static String getTextByCode(int code) {
        for (ResponseCode responseCode : ResponseCode.values()) {
            if (responseCode.getCode() == code) {
                return responseCode.getText();
            }
        }
        return ResponseCode.UNKNOWN.getText();
    }
    public String toString() {
        return code + " - " + text;
    }


}
