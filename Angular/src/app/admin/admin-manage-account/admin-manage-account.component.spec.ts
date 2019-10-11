import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminManageAccountComponent } from './admin-manage-account.component';

describe('AdminManageAccountComponent', () => {
  let component: AdminManageAccountComponent;
  let fixture: ComponentFixture<AdminManageAccountComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminManageAccountComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminManageAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
