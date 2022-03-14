package amazon.com.ui.utilities;

//import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//
//public class WriteToTxt {
//    public static void saveDataInFileWithSSN(String fileName, Customer[] customers) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < customers.length; i++)
//                writer.append(customers[i].getSsn() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static void saveDataInFileAllCustomersInfo(String fileName, Customer[] customer) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < customer.length; i++) {
//                writer.append(customer[i].getId() + " , " + customer[i].getFirstName() + " , " + customer[i].getLastName() + " , " + customer[i].getSsn() + "\n");
//                if (customer[i].getUser() != null) {
//                    writer.append(customer[i].getUser().getFirstName() + " , " + customer[i].getUser().getLastName() + "\n");
//                }
//                if (customer[i].getCountry() != null) {
//                    writer.append(customer[i].getCountry().getName() + " , " + customer[i].getCountry().getStates() + "\n");
//                }
//            }
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static void saveDataInFileSsn(String fileName, Customer customer) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            writer.append(customer.getSsn());
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//
//
//    public static void saveDataInFileWithJsonListMap(String fileName, List<Map<String, Object>> json) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            for (int i = 0; i < json.size(); i++) {
//                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("states") + "\n");
//            }
//
//            writer.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    public static void saveDataInFileWithJsonListMapState(String fileName, List<Map<String, Object>> json) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            for (int i = 0; i < json.size(); i++) {
//                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("tpcountry") + "\n");
//            }
//
//            writer.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    public static void saveDataInFile2(String fileName, Customer[] customers) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < customers.length; i++)
//
//                writer.append(customers[i].getSsn() + ",\n");
//
//            writer.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    public static void saveDataInFileWithAllCustomerInfo2(String fileName, Customer[] customers) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//
//            for (int i = 0; i < customers.length; i++) {
//
//                writer.append(customers[i].getFirstName() + " , " + customers[i].getLastName() + "," + customers[i].getCity() + " , " + customers[i].getAddress() + "\n");
//                if (customers[i].getUser() != null)
//                    writer.append(customers[i].getUser().getFirstName());
//                if (customers[i].getCountry() != null)
//                    writer.append(customers[i].getCountry().getName());
//
//            }
//
//            writer.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    public static void saveDataInFileWithUserInfo(String fileName, Customer customer) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            writer.append(customer.getUser().getFirstName());
//
//            writer.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    public static void saveAllStates(String fileName, States[] states) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            for (int i = 0; i < states.length; i++)
//                writer.append(states[i].getName() + " , " + states[i].getId() + "\n");
//
//            writer.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    //hatice method ekleme
//    public static void saveDataInFileWithCountrId(String fileName, Country[] countries) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < countries.length; i++)
//                writer.append(countries[i].getId() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//
//
//
//    public static void saveDataInFileWithStateid(String fileName, States[] sstates) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < sstates.length; i++)
//                writer.append(sstates[i].getId() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//
//    }
//
//    public static void saveDataInFileWithCountryName(String fileName, Country[] countries) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < countries.length; i++)
//                if(countries[i]!=null) {
//                    writer.append(countries[i].getName() + "\n");
//                }
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static void saveDataInFileWithCountry5Id(String fileName, Country[] countries) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < countries.length; i++)
//                writer.append(countries[i].getId() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static void saveDataInFileWithCountry6Id(String fileName, Country[] countries) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < countries.length; i++)
//                writer.append(countries[i].getId() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static void saveDataInFileWithSSN_Registrations(String fileName, Registrations[] registrations) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < registrations.length; i++)
//                writer.append(registrations[i].getSsn() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//    public static void saveDataInFileAllRegistrationsInfo(String fileName, Registrations[] registrations) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < registrations.length; i++) {
//                writer.append(registrations[i].getId() + " , " + registrations[i].getFirstName() + " , " +
//                        registrations[i].getLastName() + " , " + registrations[i].getSsn() +" , " +
//                        registrations[i].getAddress() + " , " + registrations[i].getMobilePhoneNumber() +" , " +
//                        registrations[i].getUserId() + " , " + registrations[i].getUserName() +" , " +
//                        registrations[i].getEmail() + " , " + registrations[i].getCreateDate() + "\n");
//
//            }
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//    public static void saveAllCountry(String fileName, Country[] country) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < country.length; i++) {
//                writer.append(country[i].getName() + "\n" + country[i].getId() + "\n" + country[i].getStates());
//            }
//            writer.close();
//        } catch (Exception e) {
//        }
//    }
//
//    public static void saveCustomerIDs(String fileName, List<Object> id){
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
//
//            for (int i=0; i< id.size(); i++)
//                writer.append(id.get(i).toString()+",\n");
//
//            writer.close();
//        } catch (IOException e){
//        }
//    }
//
//    public static void saveCustomerSSNs(String fileName, List<Object> ssn){
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
//
//            for (int i=0; i< ssn.size(); i++)
//                writer.append(ssn.get(i).toString()+",\n");
//
//            writer.close();
//        } catch (IOException e){
//        }
//    }
//
//    public static void saveCustomerAddress(String fileName, List<Object> address){
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
//
//            for (int i=0; i< address.size(); i++)
//                writer.append(address.get(i).toString()+",\n");
//
//            writer.close();
//        } catch (IOException e){
  //    }
//   }

//}
