package MTR.client;

import MTR.MathTools;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJKBus extends ModelBase {

	int digit1, digit2, digit3, a;
	boolean p;

	// fields
	ModelRenderer LeftWall;
	ModelRenderer RightWall;
	ModelRenderer LeftWallTop;
	ModelRenderer RightWallTop;
	ModelRenderer Back;
	ModelRenderer LeftFrontWall;
	ModelRenderer RightFrontWall;
	ModelRenderer FrontDisplay;
	ModelRenderer Front;
	ModelRenderer LeftOuterBar;
	ModelRenderer RightOuterBar;
	ModelRenderer LeftDoor1;
	ModelRenderer RightDoor1;
	ModelRenderer LeftDoor2;
	ModelRenderer RightDoor2;
	ModelRenderer LeftDoor3;
	ModelRenderer RightDoor3;
	ModelRenderer LeftBar;
	ModelRenderer RightBar;
	ModelRenderer FrontPanel;
	ModelRenderer Panel1;
	ModelRenderer Panel2;
	ModelRenderer Panel3;
	ModelRenderer Panel4;
	ModelRenderer Panel5;
	ModelRenderer Panel6;
	ModelRenderer Roof1;
	ModelRenderer Roof1L;
	ModelRenderer Roof1R;
	ModelRenderer Roof2;
	ModelRenderer Roof3;
	ModelRenderer Roof4;
	ModelRenderer Roof5;
	ModelRenderer Roof6;
	ModelRenderer Roof7;
	ModelRenderer Roof7L;
	ModelRenderer Roof7R;
	ModelRenderer Floor1;
	ModelRenderer Floor1L;
	ModelRenderer Floor1R;
	ModelRenderer Floor2;
	ModelRenderer Floor3;
	ModelRenderer Floor4;
	ModelRenderer Floor5;
	ModelRenderer Floor6;
	ModelRenderer Floor7;
	ModelRenderer Floor7L;
	ModelRenderer Floor7R;
	ModelRenderer DoorEdge1;
	ModelRenderer DoorEdge2;
	ModelRenderer DoorEdge3;
	ModelRenderer DoorEdge4;
	ModelRenderer DoorEdge5;
	ModelRenderer DoorEdge6;
	ModelRenderer Pole1;
	ModelRenderer Pole2;
	ModelRenderer Pole25;
	ModelRenderer Pole25b;
	ModelRenderer Pole25c;
	ModelRenderer Pole3;
	ModelRenderer Pole4;
	ModelRenderer Pole45;
	ModelRenderer Pole45b;
	ModelRenderer Pole45c;
	ModelRenderer Pole5;
	ModelRenderer Pole6;
	ModelRenderer HPole2;
	ModelRenderer HPole3;
	ModelRenderer HPole4;
	ModelRenderer HPole5;
	ModelRenderer Pole01;
	ModelRenderer Pole01b;
	ModelRenderer Pole01c;
	ModelRenderer Pole02;
	ModelRenderer Pole02b;
	ModelRenderer Pole02c;
	ModelRenderer Pole03;
	ModelRenderer Pole03b;
	ModelRenderer Pole03c;
	ModelRenderer Pole04;
	ModelRenderer Pole04b;
	ModelRenderer Pole04c;
	ModelRenderer Pole05;
	ModelRenderer Pole05b;
	ModelRenderer Pole05c;
	ModelRenderer Pole06;
	ModelRenderer Pole06b;
	ModelRenderer Pole06c;
	ModelRenderer Pole07;
	ModelRenderer Pole07b;
	ModelRenderer Pole07c;
	ModelRenderer Pole08;
	ModelRenderer Pole08b;
	ModelRenderer Pole08c;
	ModelRenderer HPoleRight;
	ModelRenderer RightBackWall;
	ModelRenderer LeftBackWall;
	ModelRenderer Side1L;
	ModelRenderer Side3L;
	ModelRenderer Side2L;
	ModelRenderer Side4L;
	ModelRenderer Side1R;
	ModelRenderer Side2R;
	ModelRenderer Side3R;
	ModelRenderer Side4R;
	ModelRenderer Side5R;
	ModelRenderer Side6R;
	ModelRenderer SideDisplay;
	ModelRenderer SideDisplay2;
	ModelRenderer DBack;
	ModelRenderer DFront;
	ModelRenderer DSide1;
	ModelRenderer DSide2;
	final int shift = 184;

	public ModelJKBus() {
		textureWidth = 600;
		textureHeight = 480;

		LeftWall = MathTools.part(this, 0, -278, 0, 0, 0, 0, 8, 288, 20, 8F, 40 - shift, 600, 480);
		RightWall = MathTools.part(this, 0, -288, 0, 0, 0, 0, 8, 288, -20, 8F, 40 - shift, 600, 480);
		LeftWallTop = MathTools.part(this, 0, 180, 0, 0, 0, 0, 7, 288, 20, -34F, 40 - shift, 600, 480);
		RightWallTop = MathTools.part(this, 0, 180, 0, 0, 0, 0, 10, 288, -20, -34F, 40 - shift, 600, 480);
		Back = MathTools.part(this, 150, 200, 0, 0, -1F, 26, 46, 1, -13F, -34F, 356F - shift, 600, 480);
		LeftFrontWall = MathTools.part(this, 70, 130, 0, 0, 0, 1, 50, 33, 19F, -34F, 7F - shift, 600, 480);
		RightFrontWall = MathTools.part(this, 0, 130, 0, 0, 0, 1, 50, 33, -20F, -34F, 7F - shift, 600, 480);
		FrontDisplay = MathTools.part(this, 150, 320, 0, 0, 0, 40, 9, 9, -20F, -34F, 10 - shift, 600, 480);
		Front = MathTools.part(this, 135, 135, 0, 0, 0, 40, 18, 0, -20F, -7F, 7F - shift, 600, 480);
		LeftOuterBar = MathTools.part(this, 0, 165, 0, 0, 0, 3, 3, 288, 18F, -27F, 40 - shift, 600, 480);
		RightOuterBar = MathTools.part(this, 0, 165, 0, 0, 0, 2, 0, 288, -20, -24F, 40 - shift, 600, 480);
		LeftDoor1 = MathTools.part(this, 150, 260, 0, 0, 0, 1, 34, 16, 20, -24F, 72F - shift, 600, 480);
		RightDoor1 = MathTools.part(this, 190, 260, 0, 0, 0, 1, 34, 16, 20, -24F, 88F - shift, 600, 480);
		LeftDoor2 = MathTools.part(this, 150, 260, 0, 0, 0, 1, 34, 16, 20, -24F, 168F - shift, 600, 480);
		RightDoor2 = MathTools.part(this, 190, 260, 0, 0, 0, 1, 34, 16, 20, -24F, 184F - shift, 600, 480);
		LeftDoor3 = MathTools.part(this, 150, 260, 0, 0, 0, 1, 34, 16, 20, -24F, 264F - shift, 600, 480);
		RightDoor3 = MathTools.part(this, 190, 260, 0, 0, 0, 1, 34, 16, 20, -24F, 280 - shift, 600, 480);
		LeftBar = MathTools.part(this, 0, -266, 0, 0, 0, 0, 12, 288, 18F, -24F, 40 - shift, 600, 480);
		RightBar = MathTools.part(this, 0, -252, 0, 0, 0, 0, 12, 288, -18F, -24F, 40 - shift, 600, 480);
		FrontPanel = MathTools.part(this, 205, 150, 0, 0, 0, 38, 38, 1, -19F, -30, 40 - shift, 600, 480);
		Panel1 = MathTools.part(this, 205, 200, 0, 0, 0.5F, 6, 32, 0, 12F, -24F, 68F - shift, 600, 480);
		Panel2 = MathTools.part(this, 205, 200, 0, 0, -0.5F, 6, 32, 0, 12F, -24F, 108F - shift, 600, 480);
		Panel3 = MathTools.part(this, 205, 200, 0, 0, 0.5F, 6, 32, 0, 12F, -24F, 164F - shift, 600, 480);
		Panel4 = MathTools.part(this, 205, 200, 0, 0, -0.5F, 6, 32, 0, 12F, -24F, 204F - shift, 600, 480);
		Panel5 = MathTools.part(this, 205, 200, 0, 0, 0.5F, 6, 32, 0, 12F, -24F, 260 - shift, 600, 480);
		Panel6 = MathTools.part(this, 205, 200, 0, 0, -0.5F, 6, 32, 0, 12F, -24F, 300 - shift, 600, 480);
		Roof1 = MathTools.part(this, 0, 90, 0, 0, 0, 26, 4, 30, -13F, -34F, 10 - shift, 600, 480);
		Roof1L = MathTools.part(this, 0, 310, 0, 0, 0, 8, 4, 30, 12, -30F, 40 - shift, 600, 480);
		Roof1R = MathTools.part(this, 0, 310, -8F, 0, 0, 8, 4, 30, -20, -34F, 40 - shift, 600, 480);
		Roof2 = MathTools.part(this, 368, 50, 0, 0, 0, 40, 4, 64, -20, -34F, 40 - shift, 600, 480);
		Roof3 = MathTools.part(this, 368, 50, 0, 0, 0, 40, 4, 64, -20, -34F, 104F - shift, 600, 480);
		Roof4 = MathTools.part(this, 400, 82, 0, 0, 0, 40, 4, 32, -20, -34F, 168F - shift, 600, 480);
		Roof5 = MathTools.part(this, 368, 50, 0, 0, 0, 40, 4, 64, -20, -34F, 200 - shift, 600, 480);
		Roof6 = MathTools.part(this, 368, 50, 0, 0, 0, 40, 4, 64, -20, -34F, 264F - shift, 600, 480);
		Roof7 = MathTools.part(this, 2, 90, 0, 0, 0, 26, 4, 28, 13F, -34F, 356F - shift, 600, 480);
		Roof7L = MathTools.part(this, 2, 312, -8F, 0, 0, 8, 4, 28, 20, -34F, 328F - shift, 600, 480);
		Roof7R = MathTools.part(this, 2, 312, 0, 0, 0, 8, 4, 28, -20, -34F, 328F - shift, 600, 480);
		Floor1 = MathTools.part(this, 195, 50, 0, 0, 0, 24, 0, 32, -12F, 8F, 8F - shift, 600, 480);
		Floor1L = MathTools.part(this, 200, 50, 0, 0, 0, 8, 0, 33, 20, 8F, 40 - shift, 600, 480);
		Floor1R = MathTools.part(this, 200, 50, -8F, 0, 0, 8, 0, 33, -20, 8F, 40 - shift, 600, 480);
		Floor2 = MathTools.part(this, 150, 50, 0, 0, 0, 40, 0, 64, -20, 8F, 40 - shift, 600, 480);
		Floor3 = MathTools.part(this, 150, 50, 0, 0, 0, 40, 0, 64, -20, 8F, 104F - shift, 600, 480);
		Floor4 = MathTools.part(this, 182, 50, 0, 0, 0, 40, 0, 32, -20, 8F, 168F - shift, 600, 480);
		Floor5 = MathTools.part(this, 150, 50, 0, 0, 0, 40, 0, 64, -20, 8F, 200 - shift, 600, 480);
		Floor6 = MathTools.part(this, 150, 50, 0, 0, 0, 40, 0, 64, -20, 8F, 264F - shift, 600, 480);
		Floor7 = MathTools.part(this, 195, 50, 0, 0, 0, 24, 0, 32, 12F, 8F, 360 - shift, 600, 480);
		Floor7L = MathTools.part(this, 200, 50, -8F, 0, 0, 8, 0, 32, 20, 8F, 328F - shift, 600, 480);
		Floor7R = MathTools.part(this, 200, 50, 0, 0, 0, 8, 0, 32, -20, 8F, 328F - shift, 600, 480);
		DoorEdge1 = MathTools.part(this, 120, 50, 0, 0, 0, 2, 32, 6, 18F, -24F, 68F - shift, 600, 480);
		DoorEdge2 = MathTools.part(this, 140, 50, 0, 0, 0, 2, 32, 6, 18F, -24F, 102F - shift, 600, 480);
		DoorEdge3 = MathTools.part(this, 120, 50, 0, 0, 0, 2, 32, 6, 18F, -24F, 164F - shift, 600, 480);
		DoorEdge4 = MathTools.part(this, 140, 50, 0, 0, 0, 2, 32, 6, 18F, -24F, 198F - shift, 600, 480);
		DoorEdge5 = MathTools.part(this, 120, 50, 0, 0, 0, 2, 32, 6, 18F, -24F, 260 - shift, 600, 480);
		DoorEdge6 = MathTools.part(this, 140, 50, 0, 0, 0, 2, 32, 6, 18F, -24F, 294F - shift, 600, 480);
		Pole1 = MathTools.part(this, 0, 50, 0, 0, 0, 1, 39, 1, 11F, -31F, 68F - shift, 600, 480);
		Pole2 = MathTools.part(this, 0, 50, 0, 0, 0, 1, 39, 1, 11F, -31F, 107F - shift, 600, 480);
		Pole25 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, 13F, -23F, 136F - shift, 600, 480);
		Pole25b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 6, 1, 11F, -29F, 136F - shift, 600, 480);
		Pole25c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, 11F, -31F, 136F - shift, 600, 480);
		Pole3 = MathTools.part(this, 0, 50, 0, 0, 0, 1, 39, 1, 11F, -31F, 164F - shift, 600, 480);
		Pole4 = MathTools.part(this, 0, 50, 0, 0, 0, 1, 39, 1, 11F, -31F, 203F - shift, 600, 480);
		Pole45 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, 13F, -23F, 232F - shift, 600, 480);
		Pole45b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 6, 1, 11F, -29F, 232F - shift, 600, 480);
		Pole45c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, 11F, -31F, 232F - shift, 600, 480);
		Pole5 = MathTools.part(this, 0, 50, 0, 0, 0, 1, 39, 1, 11F, -31F, 260 - shift, 600, 480);
		Pole6 = MathTools.part(this, 0, 50, 0, 0, 0, 1, 39, 1, 11F, -31F, 299F - shift, 600, 480);
		HPole2 = MathTools.part(this, 300, 120, 0, 0, 0, 1, 1, 28, 11F, -24F, 108F - shift, 600, 480);
		HPole3 = MathTools.part(this, 300, 120, -1F, 0, 0, 1, 1, 28, 11F, -24F, 164F - shift, 600, 480);
		HPole4 = MathTools.part(this, 300, 120, 0, 0, 0, 1, 1, 28, 11F, -24F, 204F - shift, 600, 480);
		HPole5 = MathTools.part(this, 300, 120, -1F, 0, 0, 1, 1, 28, 11F, -24F, 260 - shift, 600, 480);
		Pole01 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 72F - shift, 600, 480);
		Pole01b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 72F - shift, 600, 480);
		Pole01c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 72F - shift, 600, 480);
		Pole02 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 104F - shift, 600, 480);
		Pole02b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 104F - shift, 600, 480);
		Pole02c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 104F - shift, 600, 480);
		Pole03 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 136F - shift, 600, 480);
		Pole03b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 136F - shift, 600, 480);
		Pole03c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 136F - shift, 600, 480);
		Pole04 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 168F - shift, 600, 480);
		Pole04b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 168F - shift, 600, 480);
		Pole04c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 168F - shift, 600, 480);
		Pole05 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 200 - shift, 600, 480);
		Pole05b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 200 - shift, 600, 480);
		Pole05c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 200 - shift, 600, 480);
		Pole06 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 232F - shift, 600, 480);
		Pole06b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 232F - shift, 600, 480);
		Pole06c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 232F - shift, 600, 480);
		Pole07 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 264F - shift, 600, 480);
		Pole07b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 264F - shift, 600, 480);
		Pole07c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 264F - shift, 600, 480);
		Pole08 = MathTools.part(this, 0, 58, 0, 0, -0.5F, 1, 31, 1, -9F, -23F, 296F - shift, 600, 480);
		Pole08b = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 7, 1, -12F, -29F, 296F - shift, 600, 480);
		Pole08c = MathTools.part(this, 200, 120, 0, 0, -0.5F, 1, 2, 1, -12F, -31F, 296F - shift, 600, 480);
		HPoleRight = MathTools.part(this, 400, 150, 0, 0, -1F, 1, 288, 1, -9F, -24F, 40 - shift, 600, 480);
		RightBackWall = MathTools.part(this, 0, 220, 0, 0, 0, 1, 50, 33, -20, -34F, 328F - shift, 600, 480);
		LeftBackWall = MathTools.part(this, 70, 220, -1F, 0, 0, 1, 50, 33, 20, -34F, 328F - shift, 600, 480);
		Side1L = MathTools.part(this, 450, 130, 0, 0, 0, 1, 32, 32, 19F, -24F, 40 - shift, 600, 480);
		Side3L = MathTools.part(this, 450, 200, 0, 0, 0, 1, 32, 64, 19F, -24F, 200 - shift, 600, 480);
		Side2L = MathTools.part(this, 450, 200, 0, 0, 0, 1, 32, 64, 19F, -24F, 104F - shift, 600, 480);
		Side4L = MathTools.part(this, 450, 130, 0, 0, 0, 1, 32, 32, 19F, -24F, 296F - shift, 600, 480);
		Side1R = MathTools.part(this, 450, 320, 0, 0, 0, 1, 32, 32, -20, -24F, 40 - shift, 600, 480);
		Side2R = MathTools.part(this, 450, 200, 0, 0, 0, 1, 32, 64, -19F, -24F, 136F - shift, 600, 480);
		Side3R = MathTools.part(this, 450, 200, 0, 0, 0, 1, 32, 64, -19F, -24F, 200 - shift, 600, 480);
		Side4R = MathTools.part(this, 450, 320, 0, 0, 0, 1, 32, 32, -20, -24F, 200 - shift, 600, 480);
		Side5R = MathTools.part(this, 450, 200, 0, 0, 0, 1, 32, 64, -19F, -24F, 296F - shift, 600, 480);
		Side6R = MathTools.part(this, 450, 320, 0, 0, 0, 1, 32, 32, -20, -24F, 296F - shift, 600, 480);
		SideDisplay = MathTools.part(this, 10, 50, 0, 0, 0, 2, 7, 24, 17F, -24F, 236F - shift, 600, 480);
		SideDisplay2 = MathTools.part(this, 65, 50, 0, 0, 0, 1, 4, 24, 17F, -21F, 236F - shift, 600, 480);

		textureWidth = 8;
		textureHeight = 4;
		DBack = MathTools.part(this, 0, 0, 0, 0, -0.8F, 8, 4, 0, -4F, -32F, 357F - shift, 8, 4);

		textureWidth = 18;
		textureHeight = 5;
		DFront = MathTools.part(this, 0, 0, 0, 0, -0.1F, 18, 5, 0, -9F, -32F, 10 - shift, 18, 5);

		textureWidth = 22;
		textureHeight = 6;
		DSide1 = MathTools.part(this, 0, 2, -0.1F, 0, 0, 0, 6, 22, 20, -23.5F, 237F - shift, 22, 6);

		textureWidth = 24;
		textureHeight = 3;
		DSide2 = MathTools.part(this, 0, 0, -0.1F, 0, 0, 0, 3, 24, 17F, -24F, 236F - shift, 24, 3);

		setRotation(Back, 0.0949459F, 0, 0);
		setRotation(LeftFrontWall, 0, 0, 0);
		setRotation(RightFrontWall, 0, 0, 0);
		setRotation(FrontDisplay, 0.0698132F, 0, 0);
		setRotation(LeftBar, 0, 0, 2.443461F);
		setRotation(RightBar, 0, 0, -2.443461F);
		setRotation(Roof1L, 3.141592653589793F, 0, 0);
		setRotation(Roof1R, 0, 3.141592653589793F, 0);
		setRotation(Roof7, 0, (float) Math.PI, 0);
		setRotation(Roof7L, 0, -0.2449786F, 0);
		setRotation(Roof7R, 0, 0.2449786F, 0);
		setRotation(Floor1L, 0, -2.896618F, 0);
		setRotation(Floor1R, 0, 2.896618F, 0);
		setRotation(Floor7, 0, (float) Math.PI, 0);
		setRotation(Floor7L, 0, -0.2449786F, 0);
		setRotation(Floor7R, 0, 0.2449786F, 0);
		setRotation(Pole25b, 0, 0, -0.3398331F);
		setRotation(Pole45b, 0, 0, -0.3398331F);
		setRotation(HPole2, 0, 0.0698132F, 0);
		setRotation(HPole3, 0, 3.071779F, 0);
		setRotation(HPole4, 0, 0.0698132F, 0);
		setRotation(HPole5, 0, 3.071779F, 0);
		setRotation(Pole01b, 0, 0, -0.4636467F);
		setRotation(Pole02b, 0, 0, -0.4636467F);
		setRotation(Pole03b, 0, 0, -0.4636467F);
		setRotation(Pole04b, 0, 0, -0.4636467F);
		setRotation(Pole05b, 0, 0, -0.4636467F);
		setRotation(Pole06b, 0, 0, -0.4636467F);
		setRotation(Pole07b, 0, 0, -0.4636467F);
		setRotation(Pole08b, 0, 0, -0.4636467F);
		setRotation(HPoleRight, 1.570796F, 0, 0);
		setRotation(RightBackWall, 0, 0.2449786F, 0);
		setRotation(LeftBackWall, 0, -0.2449786F, 0);
		setRotation(Side2R, 0, (float) Math.PI, 0);
		setRotation(Side3R, 0, (float) Math.PI, 0);
		setRotation(Side5R, 0, (float) Math.PI, 0);
		setRotation(SideDisplay2, 0, 0, -0.1973967F);
		setRotation(DBack, 0.0949459F, 0, 0);
		setRotation(DFront, 0.0698132F, 0, 0);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		LeftWall.render(f5);
		RightWall.render(f5);
		LeftWallTop.render(f5);
		RightWallTop.render(f5);
		Back.render(f5);
		LeftFrontWall.render(f5);
		RightFrontWall.render(f5);
		FrontDisplay.render(f5);
		Front.render(f5);
		LeftOuterBar.render(f5);
		RightOuterBar.render(f5);
		LeftBar.render(f5);
		RightBar.render(f5);
		FrontPanel.render(f5);
		Panel1.render(f5);
		Panel2.render(f5);
		Panel3.render(f5);
		Panel4.render(f5);
		Panel5.render(f5);
		Panel6.render(f5);
		Roof1.render(f5);
		Roof1L.render(f5);
		Roof1R.render(f5);
		Roof2.render(f5);
		Roof3.render(f5);
		Roof4.render(f5);
		Roof5.render(f5);
		Roof6.render(f5);
		Roof7.render(f5);
		Roof7L.render(f5);
		Roof7R.render(f5);
		Floor1.render(f5);
		Floor1L.render(f5);
		Floor1R.render(f5);
		Floor2.render(f5);
		Floor3.render(f5);
		Floor4.render(f5);
		Floor5.render(f5);
		Floor6.render(f5);
		Floor7.render(f5);
		Floor7L.render(f5);
		Floor7R.render(f5);
		DoorEdge1.render(f5);
		DoorEdge2.render(f5);
		DoorEdge3.render(f5);
		DoorEdge4.render(f5);
		DoorEdge5.render(f5);
		DoorEdge6.render(f5);
		Pole1.render(f5);
		Pole2.render(f5);
		Pole25.render(f5);
		Pole25b.render(f5);
		Pole25c.render(f5);
		Pole3.render(f5);
		Pole4.render(f5);
		Pole45.render(f5);
		Pole45b.render(f5);
		Pole45c.render(f5);
		Pole5.render(f5);
		Pole6.render(f5);
		HPole2.render(f5);
		HPole3.render(f5);
		HPole4.render(f5);
		HPole5.render(f5);
		Pole01.render(f5);
		Pole01b.render(f5);
		Pole01c.render(f5);
		Pole02.render(f5);
		Pole02b.render(f5);
		Pole02c.render(f5);
		Pole03.render(f5);
		Pole03b.render(f5);
		Pole03c.render(f5);
		Pole04.render(f5);
		Pole04b.render(f5);
		Pole04c.render(f5);
		Pole05.render(f5);
		Pole05b.render(f5);
		Pole05c.render(f5);
		Pole06.render(f5);
		Pole06b.render(f5);
		Pole06c.render(f5);
		Pole07.render(f5);
		Pole07b.render(f5);
		Pole07c.render(f5);
		Pole08.render(f5);
		Pole08b.render(f5);
		Pole08c.render(f5);
		HPoleRight.render(f5);
		RightBackWall.render(f5);
		LeftBackWall.render(f5);
		Side1L.render(f5);
		Side3L.render(f5);
		Side2L.render(f5);
		Side4L.render(f5);
		Side1R.render(f5);
		Side2R.render(f5);
		Side3R.render(f5);
		Side4R.render(f5);
		Side5R.render(f5);
		Side6R.render(f5);
		SideDisplay.render(f5);
		SideDisplay2.render(f5);

		// DBack1.render(f5);
		// DBack2.render(f5);
		// DBack3.render(f5);
		// DBack4.render(f5);
		// DFront.render(f5);
		// DFront1.render(f5);
		// DFront2.render(f5);
		// DFront3.render(f5);
		// DFront4.render(f5);
		// DSide.render(f5);
		// DSide1.render(f5);
		// DSide2.render(f5);
		// DSide3.render(f5);
		// DSide4.render(f5);
	}

	public void renderDoors(float f5, float movedoor) {
		LeftDoor1.offsetZ = -0.875F * movedoor;
		RightDoor1.offsetZ = 0.875F * movedoor;
		LeftDoor2.offsetZ = -0.875F * movedoor;
		RightDoor2.offsetZ = 0.875F * movedoor;
		LeftDoor3.offsetZ = -0.875F * movedoor;
		RightDoor3.offsetZ = 0.875F * movedoor;

		LeftDoor1.render(f5);
		RightDoor1.render(f5);
		LeftDoor2.render(f5);
		RightDoor2.render(f5);
		LeftDoor3.render(f5);
		RightDoor3.render(f5);
	}

	public void renderDisplay1(float f5) {
		DFront.render(f5);
	}

	public void renderDisplay2(float f5) {
		DSide1.render(f5);
	}

	public void renderDisplay3(float f5) {
		DSide2.render(f5);
	}

	public void renderDisplay4(float f5) {
		DBack.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}