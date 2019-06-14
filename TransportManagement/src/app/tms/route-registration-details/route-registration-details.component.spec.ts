import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RouteRegistrationDetailsComponent } from './route-registration-details.component';

describe('RouteRegistrationDetailsComponent', () => {
  let component: RouteRegistrationDetailsComponent;
  let fixture: ComponentFixture<RouteRegistrationDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RouteRegistrationDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RouteRegistrationDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
