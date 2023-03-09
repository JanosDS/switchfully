package codelab02.movie;

public enum MovieType {
	ONE_DAY_MOVIE(5, 1),
	TRENDING_MOVIE(3, 7),
	OLDER_MOVIE(1, 7) {
		@Override
		public MovieType downGrade() {
			return this;
		}
	};

	private final double FIXED_PRICE;
	private final int RETURN_TIME_IN_DAYS;

	MovieType(double FIXED_PRICE, int RETURN_TIME_IN_DAYS) {
		this.FIXED_PRICE = FIXED_PRICE;
		this.RETURN_TIME_IN_DAYS = RETURN_TIME_IN_DAYS;
	}

	public MovieType downGrade() {
		return values()[ordinal() + 1];
	}

	public double getFIXED_PRICE() {
		return FIXED_PRICE;
	}

	public int getRETURN_TIME_IN_DAYS() {
		return RETURN_TIME_IN_DAYS;
	}
}
