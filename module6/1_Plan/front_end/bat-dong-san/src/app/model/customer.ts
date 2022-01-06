import {CustomerType} from "./customer-type";

export interface Customer {
  id: number;
  customerCode: string;
  customerName: string;
  dateOfBirth: string;
  customerAddress: string;
  customerPhone: string;
  email: string;
  customerType: CustomerType;
}
