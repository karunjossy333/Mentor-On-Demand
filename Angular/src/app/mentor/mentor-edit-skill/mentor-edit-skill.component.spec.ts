import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorEditSkillComponent } from './mentor-edit-skill.component';

describe('MentorEditSkillComponent', () => {
  let component: MentorEditSkillComponent;
  let fixture: ComponentFixture<MentorEditSkillComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorEditSkillComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorEditSkillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
