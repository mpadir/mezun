import { TestBed, inject } from '@angular/core/testing';

import { LoginservisService } from './loginservis.service';

describe('LoginservisService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LoginservisService]
    });
  });

  it('should be created', inject([LoginservisService], (service: LoginservisService) => {
    expect(service).toBeTruthy();
  }));
});
