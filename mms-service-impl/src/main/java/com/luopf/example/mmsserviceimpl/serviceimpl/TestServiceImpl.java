package com.luopf.example.mmsserviceimpl.serviceimpl;

import com.luopf.example.mmsservice.service.TestService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class TestServiceImpl implements TestService {

	@Override
	public String getName() {
		return "luopengfei";
	}
}
