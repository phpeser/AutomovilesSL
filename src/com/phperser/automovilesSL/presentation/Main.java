package com.phperser.automovilesSL.presentation;

import com.phperser.automovilesSL.Customer;
import com.phperser.automovilesSL.Sell;
import com.phperser.automovilesSL.Vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Sell sell1 = new Sell();
        Sell sell2 = new Sell();

        //Customer 1
        customer1.setDni("123456789X");
        customer1.setName("Pepito");
        customer1.setSurname("Grillo");
        customer1.setAdress("Calle de los lobos, 29");

        //Customer 2
        customer2.setDni("987654321X");
        customer2.setName("Roberto");
        customer2.setSurname("Wilson");
        customer2.setAdress("Calle de los caidos, 13");


        //Vehicle 1
        vehicle1.setId("01");
        vehicle1.setLicensePlate("XXX1234");
        vehicle1.setBrand("Opel");
        vehicle1.setModel("Corsa");
        vehicle1.setColor("Negro");
        vehicle1.setFuel("Diesel");
        vehicle1.setEngine("1199");
        vehicle1.setHp("75");

        //Vehicle 2
        vehicle2.setId("02");
        vehicle2.setLicensePlate("YYY4321");
        vehicle2.setBrand("Toyata");
        vehicle2.setModel("Corolla");
        vehicle2.setColor("Rojo");
        vehicle2.setFuel("Hibrido gasolina");
        vehicle2.setEngine("1798");
        vehicle2.setHp("120");


        //Sell 1
        sell1.setId("03");
        sell1.setDate("01/01/2020");
        sell1.setPayMetod("Efectivo");
        sell1.setPrice("18.350");
        sell1.setCustomer(customer1);
        sell1.setVehicle(vehicle1);

        //Sell 2
        sell2.setId("04");
        sell2.setDate("31/12/2021");
        sell2.setPayMetod("Transferencia");
        sell2.setPrice("24.660");
        sell2.setCustomer(customer2);
        sell2.setVehicle(vehicle2);


            System.out.println("-------------FACTURA-------------" + "\n" +
                    "Codigo de venta: " + sell1.getId() + "\n" +
                    "Fecha de venta: " + sell1.getDate() + "\n" +
                    "-------------Cliente-------------" + "\n" +
                    "Nombre: " + customer1.getName() + "\n" +
                    "Apellidos: " + customer1.getSurname() + "\n" +
                    "DNI: " + customer1.getDni() + "\n" +
                    "Direccion: " + customer1.getAdress() + "\n" +
                    "-------------Vehiculo-------------" + "\n" +
                    "Matricula: " + vehicle1.getLicensePlate() + "\n" +
                    "Marca: " + vehicle1.getBrand() + "\n" +
                    "Modelo: " + vehicle1.getModel() + "\n" +
                    "Color: " + vehicle1.getColor() + "\n" +
                    "Combustible: " + vehicle1.getFuel() + "\n" +
                    "Motor: " + vehicle1.getEngine() +  " cc" + "\n" +
                    "CV: " + vehicle1.getHp() + " CV" + "\n" +
                    "Metodo de pago: " + sell1.getPayMetod() + "\n" +
                    "Precio: " + sell1.getPrice() + "€");

        System.out.println("-------------FACTURA-------------" + "\n" +
                "Codigo de venta: " + sell2.getId() + "\n" +
                "Fecha de venta: " + sell2.getDate() + "\n" +
                "-------------Cliente-------------" + "\n" +
                "Nombre: " + customer2.getName() + "\n" +
                "Apellidos: " + customer2.getSurname() + "\n" +
                "DNI: " + customer2.getDni() + "\n" +
                "Direccion: " + customer2.getAdress() + "\n" +
                "-------------Vehiculo-------------" + "\n" +
                "Matricula: " + vehicle2.getLicensePlate() + "\n" +
                "Marca: " + vehicle2.getBrand() + "\n" +
                "Modelo: " + vehicle2.getModel() + "\n" +
                "Color: " + vehicle2.getColor() + "\n" +
                "Combustible: " + vehicle2.getFuel() + "\n" +
                "Motor: " + vehicle2.getEngine() + " cc" + "\n" +
                "CV: " + vehicle2.getHp() + " CV" + "\n" +
                "Metodo de pago: " + sell2.getPayMetod() + "\n" +
                "Precio: " + sell2.getPrice() + "€");



    }
}