// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer right_leg;
	private final ModelRenderer right_foot_nails;
	private final ModelRenderer right_lower_leg;
	private final ModelRenderer right_upper_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_foot_nails;
	private final ModelRenderer left_lower_leg;
	private final ModelRenderer left_upper_leg;
	private final ModelRenderer body;
	private final ModelRenderer stomach;
	private final ModelRenderer torso;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_upper_arm;
	private final ModelRenderer right_lower_arm;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_upper_arm;
	private final ModelRenderer left_lower_arm;
	private final ModelRenderer left_hand;
	private final ModelRenderer head;
	private final ModelRenderer mane;
	private final ModelRenderer mane_1;
	private final ModelRenderer mane_p1;
	private final ModelRenderer mane_p2;
	private final ModelRenderer mane_p3;
	private final ModelRenderer mane_p4;
	private final ModelRenderer mane_p5;
	private final ModelRenderer mane_2;
	private final ModelRenderer mane_p6;
	private final ModelRenderer mane_p7;
	private final ModelRenderer mane_p8;
	private final ModelRenderer mane_p9;
	private final ModelRenderer mane_p10;
	private final ModelRenderer mane_3;
	private final ModelRenderer mane_p11;
	private final ModelRenderer mane_p12;
	private final ModelRenderer mane_p13;
	private final ModelRenderer mane_p14;
	private final ModelRenderer mane_p15;
	private final ModelRenderer mane_4;
	private final ModelRenderer mane_p16;
	private final ModelRenderer mane_p17;
	private final ModelRenderer mane_p18;
	private final ModelRenderer mane_p19;
	private final ModelRenderer mane_p20;
	private final ModelRenderer mane_5;
	private final ModelRenderer mane_p21;
	private final ModelRenderer mane_p22;
	private final ModelRenderer mane_p23;
	private final ModelRenderer mane_p24;
	private final ModelRenderer mane_6;
	private final ModelRenderer mane_p26;
	private final ModelRenderer mane_p27;
	private final ModelRenderer mane_p28;
	private final ModelRenderer mane_p29;
	private final ModelRenderer mane_7;
	private final ModelRenderer mane_p31;
	private final ModelRenderer mane_p32;
	private final ModelRenderer mane_p33;
	private final ModelRenderer mane_p34;
	private final ModelRenderer mane_9;
	private final ModelRenderer mane_p41;
	private final ModelRenderer mane_p42;
	private final ModelRenderer mane_p43;
	private final ModelRenderer mane_p44;
	private final ModelRenderer mane_10;
	private final ModelRenderer mane_p46;
	private final ModelRenderer mane_p47;
	private final ModelRenderer mane_p48;
	private final ModelRenderer mane_p49;
	private final ModelRenderer mane_11;
	private final ModelRenderer mane_p51;
	private final ModelRenderer mane_p52;
	private final ModelRenderer mane_p53;
	private final ModelRenderer mane_p54;
	private final ModelRenderer mane_13;
	private final ModelRenderer mane_p61;
	private final ModelRenderer mane_p62;
	private final ModelRenderer mane_p63;
	private final ModelRenderer mane_p64;
	private final ModelRenderer mane_14;
	private final ModelRenderer mane_p66;
	private final ModelRenderer mane_p67;
	private final ModelRenderer mane_p68;
	private final ModelRenderer mane_p69;
	private final ModelRenderer mane_p70;
	private final ModelRenderer mane_15;
	private final ModelRenderer mane_p71;
	private final ModelRenderer mane_p72;
	private final ModelRenderer mane_p73;
	private final ModelRenderer mane_p74;
	private final ModelRenderer mane_p75;
	private final ModelRenderer mane_16;
	private final ModelRenderer mane_p76;
	private final ModelRenderer mane_p77;
	private final ModelRenderer mane_p78;
	private final ModelRenderer mane_p79;
	private final ModelRenderer mane_p80;
	private final ModelRenderer mane_17;
	private final ModelRenderer mane_p81;
	private final ModelRenderer mane_p82;
	private final ModelRenderer mane_p83;
	private final ModelRenderer mane_p84;
	private final ModelRenderer mane_p85;
	private final ModelRenderer mane_18;
	private final ModelRenderer mane_p86;
	private final ModelRenderer mane_p87;
	private final ModelRenderer mane_p88;
	private final ModelRenderer mane_p89;
	private final ModelRenderer mane_p90;
	private final ModelRenderer left_ear;
	private final ModelRenderer left_ear_rotated_part_1;
	private final ModelRenderer left_ear_rotated_part_2;
	private final ModelRenderer right_ear;
	private final ModelRenderer right_ear_rotated_part_1;
	private final ModelRenderer right_ear_rotated_part_2;
	private final ModelRenderer mask;
	private final ModelRenderer mask_corner_1;
	private final ModelRenderer mask_corner_2;
	private final ModelRenderer mask_corner_3;
	private final ModelRenderer mask_corner_4;
	private final ModelRenderer mask_angle_1;
	private final ModelRenderer mask_angle_2;
	private final ModelRenderer mask_angle_3;
	private final ModelRenderer mask_angle_4;
	private final ModelRenderer mask_angle_5;
	private final ModelRenderer mask_angle_6;
	private final ModelRenderer mask_angle_7;
	private final ModelRenderer mask_angle_8;
	private final ModelRenderer right_mask_horn;
	private final ModelRenderer left_mask_horn;

	public Modelcustom_model() {
		textureWidth = 256;
		textureHeight = 256;

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.0F, 6.0F, 3.0F);
		right_leg.setTextureOffset(33, 82).addBox(-2.0F, 16.0F, -6.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		right_foot_nails = new ModelRenderer(this);
		right_foot_nails.setRotationPoint(0.0F, 18.0F, -6.0F);
		right_leg.addChild(right_foot_nails);
		setRotationAngle(right_foot_nails, -0.3054F, 0.0F, 0.0F);
		right_foot_nails.setTextureOffset(63, 29).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_foot_nails.setTextureOffset(60, 62).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_foot_nails.setTextureOffset(20, 62).addBox(1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		right_lower_leg = new ModelRenderer(this);
		right_lower_leg.setRotationPoint(0.0F, 18.0F, 1.0F);
		right_leg.addChild(right_lower_leg);
		setRotationAngle(right_lower_leg, 0.1745F, 0.0F, 0.0F);
		right_lower_leg.setTextureOffset(22, 47).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		right_lower_leg.setTextureOffset(51, 88).addBox(-1.0F, -12.0F, -4.0F, 2.0F, 10.0F, 4.0F, 0.0F, false);
		right_lower_leg.setTextureOffset(59, 117).addBox(-2.0F, -12.0F, -3.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);
		right_lower_leg.setTextureOffset(30, 117).addBox(1.0F, -12.0F, -3.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);

		right_upper_leg = new ModelRenderer(this);
		right_upper_leg.setRotationPoint(-0.5F, 6.7F, -4.0F);
		right_leg.addChild(right_upper_leg);
		setRotationAngle(right_upper_leg, -0.5236F, 0.0F, 0.0F);
		right_upper_leg.setTextureOffset(55, 102).addBox(-0.5F, -8.7F, -1.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);
		right_upper_leg.setTextureOffset(114, 37).addBox(-1.5F, -8.7F, -1.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		right_upper_leg.setTextureOffset(113, 112).addBox(1.5F, -8.7F, -1.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		right_upper_leg.setTextureOffset(14, 40).addBox(-1.5F, -3.7F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		right_upper_leg.setTextureOffset(20, 11).addBox(1.5F, -3.7F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, 6.0F, 3.0F);
		left_leg.setTextureOffset(81, 29).addBox(-2.0F, 16.0F, -6.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		left_foot_nails = new ModelRenderer(this);
		left_foot_nails.setRotationPoint(1.0F, 18.0F, -6.0F);
		left_leg.addChild(left_foot_nails);
		setRotationAngle(left_foot_nails, -0.3054F, 0.0F, 0.0F);
		left_foot_nails.setTextureOffset(62, 0).addBox(-3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_foot_nails.setTextureOffset(33, 61).addBox(-1.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_foot_nails.setTextureOffset(57, 60).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_lower_leg = new ModelRenderer(this);
		left_lower_leg.setRotationPoint(1.0F, 18.0F, 1.0F);
		left_leg.addChild(left_lower_leg);
		setRotationAngle(left_lower_leg, 0.1745F, 0.0F, 0.0F);
		left_lower_leg.setTextureOffset(0, 44).addBox(-2.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		left_lower_leg.setTextureOffset(86, 82).addBox(-2.0F, -12.0F, -4.0F, 2.0F, 10.0F, 4.0F, 0.0F, false);
		left_lower_leg.setTextureOffset(14, 115).addBox(-3.0F, -12.0F, -3.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);
		left_lower_leg.setTextureOffset(96, 113).addBox(0.0F, -12.0F, -3.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);

		left_upper_leg = new ModelRenderer(this);
		left_upper_leg.setRotationPoint(0.5F, 6.7F, -4.0F);
		left_leg.addChild(left_upper_leg);
		setRotationAngle(left_upper_leg, -0.5236F, 0.0F, 0.0F);
		left_upper_leg.setTextureOffset(95, 100).addBox(-1.5F, -8.7F, -1.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(86, 113).addBox(-2.5F, -8.7F, -1.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(76, 113).addBox(0.5F, -8.7F, -1.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(0, 11).addBox(-2.5F, -3.7F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(0, 0).addBox(0.5F, -3.7F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 3.0F);

		stomach = new ModelRenderer(this);
		stomach.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(stomach);
		setRotationAngle(stomach, 0.1745F, 0.0F, 0.0F);
		stomach.setTextureOffset(0, 11).addBox(-3.5F, -8.0F, -3.0F, 7.0F, 8.0F, 6.0F, 0.0F, false);
		stomach.setTextureOffset(103, 112).addBox(-4.5F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		stomach.setTextureOffset(49, 111).addBox(3.5F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		stomach.setTextureOffset(103, 41).addBox(3.5F, -8.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		stomach.setTextureOffset(0, 102).addBox(-4.5F, -8.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		stomach.setTextureOffset(38, 18).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, -7.0F, 0.0F);
		body.addChild(torso);
		setRotationAngle(torso, 0.5672F, 0.0F, 0.0F);
		torso.setTextureOffset(0, 0).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 4.0F, 7.0F, 0.0F, false);
		torso.setTextureOffset(50, 39).addBox(-5.0F, -5.0F, -4.0F, 10.0F, 1.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(63, 36).addBox(-2.0F, -5.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(63, 27).addBox(-2.0F, -5.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(115, 93).addBox(5.0F, -4.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(114, 29).addBox(-7.0F, -4.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(40, 8).addBox(-7.0F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		torso.setTextureOffset(13, 55).addBox(5.0F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.0F, -3.0F, 1.0F);
		setRotationAngle(right_arm, 0.0873F, 0.0F, 0.1309F);

		right_upper_arm = new ModelRenderer(this);
		right_upper_arm.setRotationPoint(7.0F, 27.0F, -1.0F);
		right_arm.addChild(right_upper_arm);
		right_upper_arm.setTextureOffset(0, 83).addBox(-7.5F, -27.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		right_upper_arm.setTextureOffset(37, 0).addBox(-7.5F, -28.0F, 0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		right_lower_arm = new ModelRenderer(this);
		right_lower_arm.setRotationPoint(0.0F, 6.0F, 1.0F);
		right_arm.addChild(right_lower_arm);
		setRotationAngle(right_lower_arm, -0.3054F, 0.0F, 0.0F);
		right_lower_arm.setTextureOffset(27, 100).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);
		right_lower_arm.setTextureOffset(42, 119).addBox(1.0F, 0.0F, -2.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		right_lower_arm.setTextureOffset(36, 119).addBox(-2.0F, 0.0F, -2.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(-3.0F, 13.0F, -1.0F);
		right_arm.addChild(right_hand);
		setRotationAngle(right_hand, -0.5672F, 0.0F, 0.0F);
		right_hand.setTextureOffset(64, 112).addBox(1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(7.0F, -3.0F, 1.0F);
		setRotationAngle(left_arm, 0.0873F, 0.0F, -0.1309F);

		left_upper_arm = new ModelRenderer(this);
		left_upper_arm.setRotationPoint(7.9914F, 27.13F, -1.0114F);
		left_arm.addChild(left_upper_arm);
		left_upper_arm.setTextureOffset(20, 111).addBox(-8.5F, -27.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(27, 3).addBox(-8.5F, -28.0F, 0.5114F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		left_lower_arm = new ModelRenderer(this);
		left_lower_arm.setRotationPoint(0.9914F, 6.13F, 0.9886F);
		left_arm.addChild(left_lower_arm);
		setRotationAngle(left_lower_arm, -0.3054F, 0.0F, 0.0F);
		left_lower_arm.setTextureOffset(43, 98).addBox(-2.0F, -1.0F, -3.0F, 2.0F, 9.0F, 4.0F, 0.0F, false);
		left_lower_arm.setTextureOffset(6, 119).addBox(0.0F, 0.0F, -2.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		left_lower_arm.setTextureOffset(0, 119).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(-2.0086F, 13.13F, -1.0114F);
		left_arm.addChild(left_hand);
		setRotationAngle(left_hand, -0.5672F, 0.0F, 0.0F);
		left_hand.setTextureOffset(112, 58).addBox(0.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -5.0F, -1.0F);
		head.setTextureOffset(19, 18).addBox(-3.0F, -4.0F, -8.5F, 6.0F, 6.0F, 7.0F, 0.0F, false);

		mane = new ModelRenderer(this);
		mane.setRotationPoint(0.0F, 29.0F, 1.0F);
		head.addChild(mane);

		mane_1 = new ModelRenderer(this);
		mane_1.setRotationPoint(0.0F, -29.0F, -9.0F);
		mane.addChild(mane_1);

		mane_p1 = new ModelRenderer(this);
		mane_p1.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_1.addChild(mane_p1);
		mane_p1.setTextureOffset(94, 18).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p2 = new ModelRenderer(this);
		mane_p2.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_1.addChild(mane_p2);
		setRotationAngle(mane_p2, -0.5236F, 0.0F, 0.0F);
		mane_p2.setTextureOffset(35, 111).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p3 = new ModelRenderer(this);
		mane_p3.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_1.addChild(mane_p3);
		setRotationAngle(mane_p3, -1.1345F, 0.0F, 0.0F);
		mane_p3.setTextureOffset(98, 80).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p4 = new ModelRenderer(this);
		mane_p4.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_1.addChild(mane_p4);
		setRotationAngle(mane_p4, -1.9199F, 0.0F, 0.0F);
		mane_p4.setTextureOffset(66, 81).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p5 = new ModelRenderer(this);
		mane_p5.setRotationPoint(0.0F, -5.0F, 12.0F);
		mane_1.addChild(mane_p5);
		setRotationAngle(mane_p5, -2.7053F, 0.0F, 0.0F);
		mane_p5.setTextureOffset(50, 45).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_2 = new ModelRenderer(this);
		mane_2.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_2);
		setRotationAngle(mane_2, -0.0873F, 0.0F, 0.3927F);

		mane_p6 = new ModelRenderer(this);
		mane_p6.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_2.addChild(mane_p6);
		mane_p6.setTextureOffset(91, 57).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p7 = new ModelRenderer(this);
		mane_p7.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_2.addChild(mane_p7);
		setRotationAngle(mane_p7, -0.5236F, 0.0F, 0.0F);
		mane_p7.setTextureOffset(0, 111).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p8 = new ModelRenderer(this);
		mane_p8.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_2.addChild(mane_p8);
		setRotationAngle(mane_p8, -1.1345F, 0.0F, 0.0F);
		mane_p8.setTextureOffset(11, 98).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p9 = new ModelRenderer(this);
		mane_p9.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_2.addChild(mane_p9);
		setRotationAngle(mane_p9, -1.9199F, 0.0F, 0.0F);
		mane_p9.setTextureOffset(81, 15).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p10 = new ModelRenderer(this);
		mane_p10.setRotationPoint(0.0F, -5.0F, 12.0F);
		mane_2.addChild(mane_p10);
		setRotationAngle(mane_p10, -2.7053F, 0.0F, 0.0F);
		mane_p10.setTextureOffset(48, 0).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_3 = new ModelRenderer(this);
		mane_3.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_3);
		setRotationAngle(mane_3, -0.0436F, 0.0F, 0.7854F);

		mane_p11 = new ModelRenderer(this);
		mane_p11.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_3.addChild(mane_p11);
		mane_p11.setTextureOffset(26, 91).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p12 = new ModelRenderer(this);
		mane_p12.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_3.addChild(mane_p12);
		setRotationAngle(mane_p12, -0.5236F, 0.0F, 0.0F);
		mane_p12.setTextureOffset(110, 85).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p13 = new ModelRenderer(this);
		mane_p13.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_3.addChild(mane_p13);
		setRotationAngle(mane_p13, -1.1345F, 0.0F, 0.0F);
		mane_p13.setTextureOffset(97, 0).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p14 = new ModelRenderer(this);
		mane_p14.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_3.addChild(mane_p14);
		setRotationAngle(mane_p14, -1.9199F, 0.0F, 0.0F);
		mane_p14.setTextureOffset(77, 0).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p15 = new ModelRenderer(this);
		mane_p15.setRotationPoint(0.0F, -5.0F, 12.0F);
		mane_3.addChild(mane_p15);
		setRotationAngle(mane_p15, -2.7053F, 0.0F, 0.0F);
		mane_p15.setTextureOffset(22, 46).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_4 = new ModelRenderer(this);
		mane_4.setRotationPoint(0.0F, -31.0F, -9.0F);
		mane.addChild(mane_4);
		setRotationAngle(mane_4, 0.0436F, 0.0F, 1.2217F);

		mane_p16 = new ModelRenderer(this);
		mane_p16.setRotationPoint(0.866F, 30.5F, 9.0F);
		mane_4.addChild(mane_p16);
		mane_p16.setTextureOffset(90, 0).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p17 = new ModelRenderer(this);
		mane_p17.setRotationPoint(0.866F, -3.0F, 0.0F);
		mane_4.addChild(mane_p17);
		setRotationAngle(mane_p17, -0.5236F, 0.0F, 0.0F);
		mane_p17.setTextureOffset(109, 73).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p18 = new ModelRenderer(this);
		mane_p18.setRotationPoint(0.866F, -6.5F, 2.0F);
		mane_4.addChild(mane_p18);
		setRotationAngle(mane_p18, -1.1345F, 0.0F, 0.0F);
		mane_p18.setTextureOffset(79, 96).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p19 = new ModelRenderer(this);
		mane_p19.setRotationPoint(0.866F, -7.5F, 6.0F);
		mane_4.addChild(mane_p19);
		setRotationAngle(mane_p19, -1.9199F, 0.0F, 0.0F);
		mane_p19.setTextureOffset(20, 75).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p20 = new ModelRenderer(this);
		mane_p20.setRotationPoint(0.866F, -4.5F, 12.0F);
		mane_4.addChild(mane_p20);
		setRotationAngle(mane_p20, -2.7053F, 0.0F, 0.0F);
		mane_p20.setTextureOffset(0, 40).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_5 = new ModelRenderer(this);
		mane_5.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_5);
		setRotationAngle(mane_5, -0.0873F, 0.0F, 1.5708F);

		mane_p21 = new ModelRenderer(this);
		mane_p21.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_5.addChild(mane_p21);
		mane_p21.setTextureOffset(86, 38).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p22 = new ModelRenderer(this);
		mane_p22.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_5.addChild(mane_p22);
		setRotationAngle(mane_p22, -0.5236F, 0.0F, 0.0F);
		mane_p22.setTextureOffset(109, 5).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p23 = new ModelRenderer(this);
		mane_p23.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_5.addChild(mane_p23);
		setRotationAngle(mane_p23, -1.1345F, 0.0F, 0.0F);
		mane_p23.setTextureOffset(96, 56).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p24 = new ModelRenderer(this);
		mane_p24.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_5.addChild(mane_p24);
		setRotationAngle(mane_p24, -1.9199F, 0.0F, 0.0F);
		mane_p24.setTextureOffset(53, 74).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_6 = new ModelRenderer(this);
		mane_6.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_6);
		setRotationAngle(mane_6, -0.1309F, 0.0F, 1.8326F);

		mane_p26 = new ModelRenderer(this);
		mane_p26.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_6.addChild(mane_p26);
		mane_p26.setTextureOffset(83, 56).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p27 = new ModelRenderer(this);
		mane_p27.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_6.addChild(mane_p27);
		setRotationAngle(mane_p27, -0.5236F, 0.0F, 0.0F);
		mane_p27.setTextureOffset(107, 104).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p28 = new ModelRenderer(this);
		mane_p28.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_6.addChild(mane_p28);
		setRotationAngle(mane_p28, -1.1345F, 0.0F, 0.0F);
		mane_p28.setTextureOffset(96, 24).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p29 = new ModelRenderer(this);
		mane_p29.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_6.addChild(mane_p29);
		setRotationAngle(mane_p29, -1.9199F, 0.0F, 0.0F);
		mane_p29.setTextureOffset(73, 38).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_7 = new ModelRenderer(this);
		mane_7.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_7);
		setRotationAngle(mane_7, -0.0873F, 0.0F, 2.3562F);

		mane_p31 = new ModelRenderer(this);
		mane_p31.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_7.addChild(mane_p31);
		mane_p31.setTextureOffset(79, 82).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p32 = new ModelRenderer(this);
		mane_p32.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_7.addChild(mane_p32);
		setRotationAngle(mane_p32, -0.5236F, 0.0F, 0.0F);
		mane_p32.setTextureOffset(107, 50).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p33 = new ModelRenderer(this);
		mane_p33.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_7.addChild(mane_p33);
		setRotationAngle(mane_p33, -1.1345F, 0.0F, 0.0F);
		mane_p33.setTextureOffset(63, 95).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p34 = new ModelRenderer(this);
		mane_p34.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_7.addChild(mane_p34);
		setRotationAngle(mane_p34, -1.9199F, 0.0F, 0.0F);
		mane_p34.setTextureOffset(70, 67).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_9 = new ModelRenderer(this);
		mane_9.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_9);
		setRotationAngle(mane_9, -0.1309F, 0.0F, 2.7925F);

		mane_p41 = new ModelRenderer(this);
		mane_p41.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_9.addChild(mane_p41);
		mane_p41.setTextureOffset(72, 0).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p42 = new ModelRenderer(this);
		mane_p42.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_9.addChild(mane_p42);
		setRotationAngle(mane_p42, -0.5236F, 0.0F, 0.0F);
		mane_p42.setTextureOffset(10, 107).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p43 = new ModelRenderer(this);
		mane_p43.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_9.addChild(mane_p43);
		setRotationAngle(mane_p43, -1.1345F, 0.0F, 0.0F);
		mane_p43.setTextureOffset(94, 9).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p44 = new ModelRenderer(this);
		mane_p44.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_9.addChild(mane_p44);
		setRotationAngle(mane_p44, -1.9199F, 0.0F, 0.0F);
		mane_p44.setTextureOffset(70, 53).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_10 = new ModelRenderer(this);
		mane_10.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_10);
		setRotationAngle(mane_10, -0.1745F, 0.0F, -3.1416F);

		mane_p46 = new ModelRenderer(this);
		mane_p46.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_10.addChild(mane_p46);
		mane_p46.setTextureOffset(46, 71).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p47 = new ModelRenderer(this);
		mane_p47.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_10.addChild(mane_p47);
		setRotationAngle(mane_p47, -0.5236F, 0.0F, 0.0F);
		mane_p47.setTextureOffset(106, 14).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p48 = new ModelRenderer(this);
		mane_p48.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_10.addChild(mane_p48);
		setRotationAngle(mane_p48, -1.1345F, 0.0F, 0.0F);
		mane_p48.setTextureOffset(93, 91).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p49 = new ModelRenderer(this);
		mane_p49.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_10.addChild(mane_p49);
		setRotationAngle(mane_p49, -1.9199F, 0.0F, 0.0F);
		mane_p49.setTextureOffset(0, 69).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_11 = new ModelRenderer(this);
		mane_11.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_11);
		setRotationAngle(mane_11, -0.1309F, 0.0F, -2.7925F);

		mane_p51 = new ModelRenderer(this);
		mane_p51.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_11.addChild(mane_p51);
		mane_p51.setTextureOffset(46, 68).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p52 = new ModelRenderer(this);
		mane_p52.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_11.addChild(mane_p52);
		setRotationAngle(mane_p52, -0.5236F, 0.0F, 0.0F);
		mane_p52.setTextureOffset(105, 96).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p53 = new ModelRenderer(this);
		mane_p53.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_11.addChild(mane_p53);
		setRotationAngle(mane_p53, -1.1345F, 0.0F, 0.0F);
		mane_p53.setTextureOffset(93, 38).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p54 = new ModelRenderer(this);
		mane_p54.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_11.addChild(mane_p54);
		setRotationAngle(mane_p54, -1.9199F, 0.0F, 0.0F);
		mane_p54.setTextureOffset(33, 68).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_13 = new ModelRenderer(this);
		mane_13.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_13);
		setRotationAngle(mane_13, -0.0873F, 0.0F, -2.3562F);

		mane_p61 = new ModelRenderer(this);
		mane_p61.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_13.addChild(mane_p61);
		mane_p61.setTextureOffset(64, 50).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p62 = new ModelRenderer(this);
		mane_p62.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_13.addChild(mane_p62);
		setRotationAngle(mane_p62, -0.5236F, 0.0F, 0.0F);
		mane_p62.setTextureOffset(81, 105).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p63 = new ModelRenderer(this);
		mane_p63.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_13.addChild(mane_p63);
		setRotationAngle(mane_p63, -1.1345F, 0.0F, 0.0F);
		mane_p63.setTextureOffset(0, 93).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p64 = new ModelRenderer(this);
		mane_p64.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_13.addChild(mane_p64);
		setRotationAngle(mane_p64, -1.9199F, 0.0F, 0.0F);
		mane_p64.setTextureOffset(68, 22).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_14 = new ModelRenderer(this);
		mane_14.setRotationPoint(0.0F, -31.0F, -9.0F);
		mane.addChild(mane_14);
		setRotationAngle(mane_14, -0.1309F, 0.0F, -1.8326F);

		mane_p66 = new ModelRenderer(this);
		mane_p66.setRotationPoint(-0.9848F, 29.8264F, 9.0F);
		mane_14.addChild(mane_p66);
		mane_p66.setTextureOffset(64, 22).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p67 = new ModelRenderer(this);
		mane_p67.setRotationPoint(-0.9848F, -3.6737F, 0.0F);
		mane_14.addChild(mane_p67);
		setRotationAngle(mane_p67, -0.5236F, 0.0F, 0.0F);
		mane_p67.setTextureOffset(67, 104).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p68 = new ModelRenderer(this);
		mane_p68.setRotationPoint(-0.9848F, -7.1737F, 2.0F);
		mane_14.addChild(mane_p68);
		setRotationAngle(mane_p68, -1.1345F, 0.0F, 0.0F);
		mane_p68.setTextureOffset(92, 71).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p69 = new ModelRenderer(this);
		mane_p69.setRotationPoint(-0.9848F, -8.1737F, 6.0F);
		mane_14.addChild(mane_p69);
		setRotationAngle(mane_p69, -1.9199F, 0.0F, 0.0F);
		mane_p69.setTextureOffset(64, 8).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p70 = new ModelRenderer(this);
		mane_p70.setRotationPoint(-0.9848F, -5.1737F, 12.0F);
		mane_14.addChild(mane_p70);
		setRotationAngle(mane_p70, -2.7053F, 0.0F, 0.0F);
		mane_p70.setTextureOffset(36, 38).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_15 = new ModelRenderer(this);
		mane_15.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_15);
		setRotationAngle(mane_15, -0.0873F, 0.0F, -1.5708F);

		mane_p71 = new ModelRenderer(this);
		mane_p71.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_15.addChild(mane_p71);
		mane_p71.setTextureOffset(51, 27).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p72 = new ModelRenderer(this);
		mane_p72.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_15.addChild(mane_p72);
		setRotationAngle(mane_p72, -0.5236F, 0.0F, 0.0F);
		mane_p72.setTextureOffset(104, 33).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p73 = new ModelRenderer(this);
		mane_p73.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_15.addChild(mane_p73);
		setRotationAngle(mane_p73, -1.1345F, 0.0F, 0.0F);
		mane_p73.setTextureOffset(31, 91).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p74 = new ModelRenderer(this);
		mane_p74.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_15.addChild(mane_p74);
		setRotationAngle(mane_p74, -1.9199F, 0.0F, 0.0F);
		mane_p74.setTextureOffset(20, 61).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p75 = new ModelRenderer(this);
		mane_p75.setRotationPoint(0.0F, -5.0F, 12.0F);
		mane_15.addChild(mane_p75);
		setRotationAngle(mane_p75, -2.7053F, 0.0F, 0.0F);
		mane_p75.setTextureOffset(37, 23).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_16 = new ModelRenderer(this);
		mane_16.setRotationPoint(0.0F, -31.0F, -9.0F);
		mane.addChild(mane_16);
		setRotationAngle(mane_16, 0.0436F, 0.0F, -1.2217F);

		mane_p76 = new ModelRenderer(this);
		mane_p76.setRotationPoint(-0.866F, 30.5F, 9.0F);
		mane_16.addChild(mane_p76);
		mane_p76.setTextureOffset(51, 23).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p77 = new ModelRenderer(this);
		mane_p77.setRotationPoint(-0.866F, -3.0F, 0.0F);
		mane_16.addChild(mane_p77);
		setRotationAngle(mane_p77, -0.5236F, 0.0F, 0.0F);
		mane_p77.setTextureOffset(103, 65).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p78 = new ModelRenderer(this);
		mane_p78.setRotationPoint(-0.866F, -6.5F, 2.0F);
		mane_16.addChild(mane_p78);
		setRotationAngle(mane_p78, -1.1345F, 0.0F, 0.0F);
		mane_p78.setTextureOffset(15, 89).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p79 = new ModelRenderer(this);
		mane_p79.setRotationPoint(-0.866F, -7.5F, 6.0F);
		mane_16.addChild(mane_p79);
		setRotationAngle(mane_p79, -1.9199F, 0.0F, 0.0F);
		mane_p79.setTextureOffset(57, 60).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p80 = new ModelRenderer(this);
		mane_p80.setRotationPoint(-0.866F, -4.5F, 12.0F);
		mane_16.addChild(mane_p80);
		setRotationAngle(mane_p80, -2.7053F, 0.0F, 0.0F);
		mane_p80.setTextureOffset(22, 31).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_17 = new ModelRenderer(this);
		mane_17.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_17);
		setRotationAngle(mane_17, -0.0436F, 0.0F, -0.7854F);

		mane_p81 = new ModelRenderer(this);
		mane_p81.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_17.addChild(mane_p81);
		mane_p81.setTextureOffset(48, 15).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p82 = new ModelRenderer(this);
		mane_p82.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_17.addChild(mane_p82);
		setRotationAngle(mane_p82, -0.5236F, 0.0F, 0.0F);
		mane_p82.setTextureOffset(62, 0).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p83 = new ModelRenderer(this);
		mane_p83.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_17.addChild(mane_p83);
		setRotationAngle(mane_p83, -1.1345F, 0.0F, 0.0F);
		mane_p83.setTextureOffset(88, 47).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p84 = new ModelRenderer(this);
		mane_p84.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_17.addChild(mane_p84);
		setRotationAngle(mane_p84, -1.9199F, 0.0F, 0.0F);
		mane_p84.setTextureOffset(0, 55).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p85 = new ModelRenderer(this);
		mane_p85.setRotationPoint(0.0F, -5.0F, 12.0F);
		mane_17.addChild(mane_p85);
		setRotationAngle(mane_p85, -2.7053F, 0.0F, 0.0F);
		mane_p85.setTextureOffset(26, 3).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		mane_18 = new ModelRenderer(this);
		mane_18.setRotationPoint(0.0F, -30.0F, -9.0F);
		mane.addChild(mane_18);
		setRotationAngle(mane_18, -0.0873F, 0.0F, -0.3927F);

		mane_p86 = new ModelRenderer(this);
		mane_p86.setRotationPoint(0.0F, 30.0F, 9.0F);
		mane_18.addChild(mane_p86);
		mane_p86.setTextureOffset(27, 0).addBox(-1.5F, -33.5F, -9.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		mane_p87 = new ModelRenderer(this);
		mane_p87.setRotationPoint(0.0F, -3.5F, 0.0F);
		mane_18.addChild(mane_p87);
		setRotationAngle(mane_p87, -0.5236F, 0.0F, 0.0F);
		mane_p87.setTextureOffset(40, 0).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		mane_p88 = new ModelRenderer(this);
		mane_p88.setRotationPoint(0.0F, -7.0F, 2.0F);
		mane_18.addChild(mane_p88);
		setRotationAngle(mane_p88, -1.1345F, 0.0F, 0.0F);
		mane_p88.setTextureOffset(85, 62).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);

		mane_p89 = new ModelRenderer(this);
		mane_p89.setRotationPoint(0.0F, -8.0F, 6.0F);
		mane_18.addChild(mane_p89);
		setRotationAngle(mane_p89, -1.9199F, 0.0F, 0.0F);
		mane_p89.setTextureOffset(37, 54).addBox(-1.5F, -6.5F, -0.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);

		mane_p90 = new ModelRenderer(this);
		mane_p90.setRotationPoint(0.0F, -5.0F, 12.0F);
		mane_18.addChild(mane_p90);
		setRotationAngle(mane_p90, -2.7053F, 0.0F, 0.0F);
		mane_p90.setTextureOffset(0, 25).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 7.0F, 8.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(2.0F, -6.0F, -1.0F);
		head.addChild(left_ear);
		setRotationAngle(left_ear, 0.8727F, 0.3491F, 0.2618F);
		left_ear.setTextureOffset(51, 15).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		left_ear.setTextureOffset(0, 83).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		left_ear.setTextureOffset(13, 55).addBox(2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		left_ear_rotated_part_1 = new ModelRenderer(this);
		left_ear_rotated_part_1.setRotationPoint(1.0F, 0.0F, 11.0F);
		left_ear.addChild(left_ear_rotated_part_1);
		setRotationAngle(left_ear_rotated_part_1, 0.0F, -0.48F, 0.0F);
		left_ear_rotated_part_1.setTextureOffset(22, 31).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		left_ear_rotated_part_2 = new ModelRenderer(this);
		left_ear_rotated_part_2.setRotationPoint(2.0F, -1.0F, 8.0F);
		left_ear.addChild(left_ear_rotated_part_2);
		setRotationAngle(left_ear_rotated_part_2, 0.0F, -0.2182F, 0.0F);
		left_ear_rotated_part_2.setTextureOffset(0, 29).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-2.0F, -6.0F, -1.0F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, 0.8727F, -0.3491F, -0.2618F);
		right_ear.setTextureOffset(50, 27).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		right_ear.setTextureOffset(81, 72).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		right_ear.setTextureOffset(14, 40).addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		right_ear_rotated_part_1 = new ModelRenderer(this);
		right_ear_rotated_part_1.setRotationPoint(-1.0F, 0.0F, 11.0F);
		right_ear.addChild(right_ear_rotated_part_1);
		setRotationAngle(right_ear_rotated_part_1, 0.0F, 0.48F, 0.0F);
		right_ear_rotated_part_1.setTextureOffset(14, 28).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		right_ear_rotated_part_2 = new ModelRenderer(this);
		right_ear_rotated_part_2.setRotationPoint(-2.0F, -1.0F, 8.0F);
		right_ear.addChild(right_ear_rotated_part_2);
		setRotationAngle(right_ear_rotated_part_2, 0.0F, 0.2182F, 0.0F);
		right_ear_rotated_part_2.setTextureOffset(0, 25).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		mask = new ModelRenderer(this);
		mask.setRotationPoint(0.0F, 26.0F, 6.0F);
		head.addChild(mask);
		mask.setTextureOffset(107, 22).addBox(-3.0F, -30.0F, -15.5F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(3, 59).addBox(-4.0F, -28.0F, -15.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(58, 15).addBox(3.0F, -28.0F, -15.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(0, 55).addBox(-1.0F, -31.0F, -15.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(54, 20).addBox(-1.0F, -24.0F, -15.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		mask_corner_1 = new ModelRenderer(this);
		mask_corner_1.setRotationPoint(3.0F, -24.0F, -15.0F);
		mask.addChild(mask_corner_1);
		setRotationAngle(mask_corner_1, 0.0F, 0.0F, -0.7854F);
		mask_corner_1.setTextureOffset(63, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		mask_corner_2 = new ModelRenderer(this);
		mask_corner_2.setRotationPoint(-3.0F, -24.0F, -15.0F);
		mask.addChild(mask_corner_2);
		setRotationAngle(mask_corner_2, 0.0F, 0.0F, -0.7854F);
		mask_corner_2.setTextureOffset(50, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		mask_corner_3 = new ModelRenderer(this);
		mask_corner_3.setRotationPoint(-3.0F, -30.0F, -15.0F);
		mask.addChild(mask_corner_3);
		setRotationAngle(mask_corner_3, 0.0F, 0.0F, -0.7854F);
		mask_corner_3.setTextureOffset(35, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		mask_corner_4 = new ModelRenderer(this);
		mask_corner_4.setRotationPoint(3.0F, -30.0F, -15.0F);
		mask.addChild(mask_corner_4);
		setRotationAngle(mask_corner_4, 0.0F, 0.0F, -0.7854F);
		mask_corner_4.setTextureOffset(21, 31).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		mask_angle_1 = new ModelRenderer(this);
		mask_angle_1.setRotationPoint(1.0F, -23.0F, -15.0F);
		mask.addChild(mask_angle_1);
		setRotationAngle(mask_angle_1, 0.0F, 0.0F, -0.1309F);
		mask_angle_1.setTextureOffset(54, 18).addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		mask_angle_2 = new ModelRenderer(this);
		mask_angle_2.setRotationPoint(-1.0F, -23.0F, -15.0F);
		mask.addChild(mask_angle_2);
		setRotationAngle(mask_angle_2, 0.0F, 0.0F, 0.1309F);
		mask_angle_2.setTextureOffset(22, 52).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		mask_angle_3 = new ModelRenderer(this);
		mask_angle_3.setRotationPoint(-1.0F, -31.0F, -15.0F);
		mask.addChild(mask_angle_3);
		setRotationAngle(mask_angle_3, 0.0F, 0.0F, -0.1309F);
		mask_angle_3.setTextureOffset(22, 50).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		mask_angle_4 = new ModelRenderer(this);
		mask_angle_4.setRotationPoint(1.0F, -31.0F, -15.0F);
		mask.addChild(mask_angle_4);
		setRotationAngle(mask_angle_4, 0.0F, 0.0F, 0.1309F);
		mask_angle_4.setTextureOffset(38, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		mask_angle_5 = new ModelRenderer(this);
		mask_angle_5.setRotationPoint(4.0F, -28.0F, -15.0F);
		mask.addChild(mask_angle_5);
		setRotationAngle(mask_angle_5, 0.0F, 0.0F, -0.1309F);
		mask_angle_5.setTextureOffset(13, 57).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		mask_angle_6 = new ModelRenderer(this);
		mask_angle_6.setRotationPoint(4.0F, -26.0F, -15.0F);
		mask.addChild(mask_angle_6);
		setRotationAngle(mask_angle_6, 0.0F, 0.0F, 0.1309F);
		mask_angle_6.setTextureOffset(0, 57).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		mask_angle_7 = new ModelRenderer(this);
		mask_angle_7.setRotationPoint(-4.0F, -26.0F, -15.0F);
		mask.addChild(mask_angle_7);
		setRotationAngle(mask_angle_7, 0.0F, 0.0F, -0.1309F);
		mask_angle_7.setTextureOffset(50, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		mask_angle_8 = new ModelRenderer(this);
		mask_angle_8.setRotationPoint(-4.0F, -28.0F, -15.0F);
		mask.addChild(mask_angle_8);
		setRotationAngle(mask_angle_8, 0.0F, 0.0F, 0.1309F);
		mask_angle_8.setTextureOffset(14, 25).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		right_mask_horn = new ModelRenderer(this);
		right_mask_horn.setRotationPoint(-4.0F, -30.0F, -20.0F);
		mask.addChild(right_mask_horn);
		setRotationAngle(right_mask_horn, -0.1745F, 0.3491F, 0.0873F);
		right_mask_horn.setTextureOffset(0, 40).addBox(-1.0F, 0.0F, 2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		right_mask_horn.setTextureOffset(50, 0).addBox(-1.0F, -3.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_mask_horn = new ModelRenderer(this);
		left_mask_horn.setRotationPoint(4.0F, -30.0F, -20.0F);
		mask.addChild(left_mask_horn);
		setRotationAngle(left_mask_horn, -0.1745F, -0.3491F, -0.0873F);
		left_mask_horn.setTextureOffset(22, 35).addBox(0.0F, 0.0F, 2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		left_mask_horn.setTextureOffset(38, 18).addBox(0.0F, -3.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}