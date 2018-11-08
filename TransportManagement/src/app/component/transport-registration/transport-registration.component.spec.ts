import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TransportRegistrationComponent } from './transport-registration.component';

describe('TransportRegistrationComponent', () => {
  let component: TransportRegistrationComponent;
  let fixture: ComponentFixture<TransportRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TransportRegistrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TransportRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
