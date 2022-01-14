import {CustomerType} from "./customer-type";

export interface Customer {
  id: number;
  address: string;
  dateOfBirth: string;
  email: string;
  gender: string;
  name: string;
  phoneNumber: string;
  image: string;
}
