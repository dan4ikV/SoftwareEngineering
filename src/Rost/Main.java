package Rost;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MobilePhone> mobilePhones = new ArrayList<MobilePhone>();
        mobilePhones.add(new MobilePhone("+380665667898", "Samsung", 25000, new int[]{1920, 1080}));
        mobilePhones.add(new MobilePhone("+380665667899", "Apple", 5000, new int[]{1920, 1080}));
        mobilePhones.add(new MobilePhone("+380665667100", "Google", 15000, new int[]{1920, 1080}));
        mobilePhones.add(new MobilePhone("+380665667102", "Xiaomi", 35000, new int[]{1920, 1080}));
        mobilePhones.add(new MobilePhone("+380665667103", "Xiaomi", 25000, new int[]{1920, 1080}));

        mobilePhones.get(0).call(mobilePhones.get(1));
        mobilePhones.get(0).call(mobilePhones.get(2));
        mobilePhones.get(0).call(mobilePhones.get(3));
        mobilePhones.get(4).call(mobilePhones.get(0));

        System.out.println("Інформація про телефон: " + mobilePhones.get(0).toString() + "\n");

        System.out.println("Історія дзвінків телефона " + mobilePhones.get(0).getNumber());
        mobilePhones.get(0).showCallHistory();

        //всі телефони марки Xiaomi:
        System.out.println("\nВсі телефони марки Xiaomi\n");
        for (int i = 0; i < mobilePhones.size(); i++){
            if(mobilePhones.get(i).getManufacturer() == "Xiaomi"){
                System.out.println(mobilePhones.get(i).toString() + "\n");
            }
        }

        System.out.println("\nВсі телефони з батареє більше 10000 mAh\n");
        for (int i = 0; i < mobilePhones.size(); i++){
            if(mobilePhones.get(i).getBatteryCapacity() > 10000){
                System.out.println(mobilePhones.get(i).toString() + "\n");
            }
        }


        //перевірка чи програма розрізняє мобільний і стаціонарний телефони і чи вони наслідуються від звичайного телефона
        StationaryPhone stationaryPhone = new StationaryPhone("22885", "Panasonic", "Rostyk");
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(stationaryPhone);
        phones.add(mobilePhones.get(0));

        //у даний список ми можемо додавати і стаціонарні і мобільні телефони адже вони наслідуються від класу Phone
        //проте з даного спику ми можемо викликати той функціонал телефону, який закладений у батьківскьому класі Phone
        for(Phone phone : phones){
            System.out.println("Виробник телефону: " + phone.getManufacturer());
        }

    }
}
