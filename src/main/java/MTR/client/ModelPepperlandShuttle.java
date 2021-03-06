package MTR.client;

import MTR.MathTools;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPepperlandShuttle extends ModelBase {

	int digit1, digit2, digit3, a;
	boolean p;

	// fields
    ModelRenderer back;
    ModelRenderer front;
    ModelRenderer door1;
    ModelRenderer leftDoor;
    ModelRenderer rightDoor;
    ModelRenderer leftWall;
    ModelRenderer rightWall1;
    ModelRenderer rightWall2;
    ModelRenderer topBarOutLeft;
    ModelRenderer topBarOutRight;
    ModelRenderer top;
    ModelRenderer bottom;
    ModelRenderer DFront;
    ModelRenderer DBack;
    ModelRenderer DSide1;
    ModelRenderer DFrontSticker;
    ModelRenderer DBackSticker;
	//final int shift = 128;

	public ModelPepperlandShuttle() {
		textureWidth = 600;
		textureHeight = 480;

		back = MathTools.part(this, 0, 90, 0, 0, 0, 40, 40, 1, -20F, -32F, 100F , 600, 480);
		front = MathTools.part(this, 0, 0, 0, 0, 0, 40, 42, 4, -20F, -32F, -100f, 600, 480);
        door1 = MathTools.part(this, 90, 0, 0, 0, 0, 1, 36, 16, -19.5F, -25F, -96f, 600, 480);
		leftDoor= MathTools.part(this, 90, 0, 0, 0, 0, 1, 36, 16, -19.5F, -25F, -16f, 600, 480);
        rightDoor= MathTools.part(this, 140, 0, 0, 0, 0, 1, 36, 16, -19.5F, -25F, 0f, 600, 480);
        leftWall= MathTools.part(this, 0, 230, 0, 0, 0, 1, 36, 196, 19F, -25F, -96f, 600, 480);
        rightWall1=MathTools.part(this, 240, 250, 0, 0, 0, 1, 36, 65, -20F, -25F, -80f, 600, 480);
        rightWall2=MathTools.part(this, 0, 230, 0, 0, 0, 1, 36, 84, -20F, -25F, 16f, 600, 480);
        topBarOutLeft=MathTools.part(this, 0, 15, 0, 0, 0, 1, 7, 196, 19F, -32F, -96f, 600, 480);
        topBarOutRight=MathTools.part(this, 0, 15, 0, 0, 0, 1, 7, 196, -20F, -32F, -96f, 600, 480);
        top=MathTools.part(this, 60, 0, 0, 0, 0, 38, 1, 196, -19F, -32F, -96F, 600, 480);
        bottom=MathTools.part(this, 60, 0, 0, 0, 0, 38, 1, 196, -19F, 6F, -96F, 600, 480);
		
        textureWidth = 38;
		textureHeight = 5;
		DBack = MathTools.part(this, 0, 0, 0, 0, -0.1F, 38, 5, 0, -19F, -29F, 102, 38, 5);

		textureWidth = 38;
		textureHeight = 5;
		DFront = MathTools.part(this, 0, 0, 0, 0, -0.1F, 38, 5, 0, -19F, -29F, -100, 38, 5);
        
        textureWidth = 4;
        textureHeight = 4;
        DFrontSticker = MathTools.part(this, 0, 0, 0, 0, -0.1F, 4, 4, 0, -18F, -6, -100, 4, 4);
        
        textureWidth = 4;
        textureHeight = 4;
        DBackSticker = MathTools.part(this, 0, 0, 0, 0, 0.1F, 4, 4, 0, -18F, -6, 101, 4, 4);
                                       

		textureWidth = 25;
		textureHeight = 6;
		DSide1 = MathTools.part(this, 0, 0, -0.1F, 0, 0, 0, 6, 25, -20, -10F, -74, 25, 6);

		

		//setRotation(Back, 0, 0, 0);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
        back.render(f5);
        front.render(f5);
        door1.render(f5);
        leftDoor.render(f5);
        rightDoor.render(f5);
        leftWall.render(f5);
        rightWall1.render(f5);
        rightWall2.render(f5);
        topBarOutLeft.render(f5);
        topBarOutRight.render(f5);
        top.render(f5);
        bottom.render(f5);
        
		
	}

	public void renderDoors(float f5, float movedoor) {
		//LeftDoor1.rotateAngleY  = -0.875F * movedoor*3.14f/2f;
        //LeftDoor1.offsetX  = 0.875F * movedoor;
		//RightDoor1.rotateAngleY  = 0.875F * movedoor*3.14f/2f;
       // RightDoor1.offsetX  = 0.875F * movedoor-(float)Math.sin(movedoor*3.14f/2f);
       // RightDoor1.offsetZ = 0.875F * movedoor;
        door1.rotateAngleY  = -0.875F * movedoor*3.14f/2f;
        door1.offsetX  = 0.875F * movedoor;
        //LeftDoor1.offsetX  = 0.875F * movedoor;
       // RightDoor1.rotateAngleY  = -0.875F * movedoor*3.14f/2f;
       //RightDoor1.offsetX  = (float)Math.sin(0.875F*movedoor*3.14f/2f);
       // RightDoor1.offsetZ = -1F+(float)Math.cos(0.875F*movedoor*3.14f/2f);
        
        leftDoor.rotateAngleY  = -0.875F * movedoor*3.14f/2f;
        leftDoor.offsetX  = 0.875F * movedoor;
        rightDoor.rotateAngleY  = 0.875F * movedoor*3.14f/2f;
        rightDoor.offsetX  = 0.875F * movedoor-(float)Math.sin(0.875F*movedoor*3.14f/2f);
        rightDoor.offsetZ = 0.875F * movedoor;
        //LeftDoor2.offsetZ = -0.875F * movedoor;
		//RightDoor2.offsetZ = 0.875F * movedoor;
		//LeftDoor3.offsetZ = -0.875F * movedoor;
		//RightDoor3.offsetZ = 0.875F * movedoor;

        door1.render(f5);
        leftDoor.render(f5);
        rightDoor.render(f5);
		//LeftDoor3.render(f5);
		//RightDoor3.render(f5);
	}

	public void renderDisplay1(float f5) {
		DFront.render(f5);
	}

	public void renderDisplay2(float f5) {
		DSide1.render(f5);
	}

	public void renderDisplay3(float f5) {
		DFrontSticker.render(f5);
	}

	public void renderDisplay4(float f5) {
		DBackSticker.render(f5);
	}
    
    public void renderDisplay5(float f5) {
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
