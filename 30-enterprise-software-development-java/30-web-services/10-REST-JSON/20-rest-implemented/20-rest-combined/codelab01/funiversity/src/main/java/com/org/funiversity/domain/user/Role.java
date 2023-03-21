package com.org.funiversity.domain.user;

import java.util.ArrayList;
import java.util.List;

import static com.org.funiversity.domain.user.Feature.ADD_PROFESSOR;

public enum Role {
	ADMIN(new ArrayList<Feature>() {{
		add(ADD_PROFESSOR);
	}}),
	PROFESSOR(new ArrayList<Feature>());
	private List<Feature> features;

	Role(List<Feature> features) {
		this.features = features;
	}

	public boolean hasFeature(Feature feature) {
		return features.contains(feature);
	}
}
