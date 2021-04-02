//package Graphs;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public List<String> findItinerary(List<List<String>> tickets) {
//        List<String> list = new ArrayList<>();
//        List<String> ll=new ArrayList<>();
//        int s=tickets.size();
//        int index=0;
//        for( int i=0 ; i < tickets.size(); i++ ) {
//            List<String> var = tickets.get(i);
//            if( var.get(0).equals("JFK"))
//                for( int j=0 ; j < tickets.size(); j++ ) {
//                    List<String> var1 = tickets.get(j);
//                }
//                ll.add(tickets.get(i).get(1));
//        }
//        list.add("JFK");
//        if(!ll.isEmpty()){
//            String temp=ll.get(0);
//            for(int i=1;i<=ll.size()-1;i++) {
//                if(temp.charAt(0)>ll.get(i).charAt(0)){
//                    temp=ll.get(i);index=i;
//                }
//            }
//            list.add(temp);
//            for(int i=0;i<tickets.size();i++)
//            {
//                List<String> var = tickets.get(i);
//                if( var.get(0).equals("JFK")&&var.get(1).equals(temp))
//                    index=i;
//
//            }
//            tickets.remove(index);
//            System.out.println(temp+" hi");
//            int j=0;
//            while(j<s){
//                for(int i=0;i<tickets.size();i++) {
//                    List<String> var = tickets.get(i);
//                    if (var.get(0).equals(temp)) {
//                        list.add(var.get(1));
//                        temp = var.get(1);
//                        tickets.remove(i);
//                    }
//                }
//                j++;
//            }
//        }
//        return list;
//    }
//}
///*
//public class MainClass {
//    public static String[] stringToStringArray(String line) {
//        JsonArray jsonArray = JsonArray.readFrom(line);
//        String[] arr = new String[jsonArray.size()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = jsonArray.get(i).asString();
//        }
//        return arr;
//    }
//
//    public static List<List<String>> stringToString2dArray(String input) {
//        JsonArray jsonArray = JsonArray.readFrom(input);
//        if (jsonArray.size() == 0) {
//            return new ArrayList<List<String>>();
//        }
//        List<List<String>> list = new ArrayList<>(jsonArray.size());
//        for (int i = 0; i < jsonArray.size(); i++) {
//            JsonArray cols = jsonArray.get(i).asArray();
//            list.add(stringToStringList(cols.toString()));
//        }
//        return list;
//    }
//
//    public static String stringListToString(List<String> stringList) {
//        StringBuilder sb = new StringBuilder("[");
//        for (String item : stringList) {
//            sb.append(item);
//            sb.append(",");
//        }
//
//        sb.setCharAt(sb.length() - 1, ']');
//        return sb.toString();
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            List<List<String>> tickets = stringToString2dList(line);
//
//            List<String> ret = new Solution().findItinerary(tickets);
//
//            String out = stringListToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}