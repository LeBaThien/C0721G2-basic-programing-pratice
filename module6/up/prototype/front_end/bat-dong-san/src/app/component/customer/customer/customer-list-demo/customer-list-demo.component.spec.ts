import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerListDemoComponent } from './customer-list-demo.component';

describe('CustomerListDemoComponent', () => {
  let component: CustomerListDemoComponent;
  let fixture: ComponentFixture<CustomerListDemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerListDemoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerListDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
