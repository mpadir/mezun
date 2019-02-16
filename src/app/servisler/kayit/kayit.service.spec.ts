import { TestBed, inject } from '@angular/core/testing';

import { KayitService } from './kayit.service';

describe('KayitService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [KayitService]
    });
  });

  it('should be created', inject([KayitService], (service: KayitService) => {
    expect(service).toBeTruthy();
  }));
});
