package com.ass2.q22;

public class Main {

	public static void main(String[] args) {
		TvRemote bpl = new BPLTv();
		TvRemote sony =  new SonyTv();
		TvRemote panasonic = new PanasonicTv();

		bpl.DiffTvs();
		sony.DiffTvs();
		panasonic.DiffTvs();
	}

}
