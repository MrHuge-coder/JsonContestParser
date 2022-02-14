package com.dymkov_own;

import com.google.gson.Gson;

public class JSONContestParses {
    public static ContestInfo parseContestInfo(String jsonString) {
        return new Gson().fromJson(jsonString, ContestInfo.class);
    }

    public static ProblemList parseProblemList(String jsonString) {
        return new Gson().fromJson(jsonString, ProblemList.class);
    }
}
