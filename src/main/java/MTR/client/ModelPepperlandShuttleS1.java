package MTR.client;

import MTR.MathTools;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPepperlandShuttleS1 extends ModelBase {

	int digit1, digit2, digit3, a;
	boolean p;

	// fields
    ModelRenderer back;
    ModelRenderer front;
    ModelRenderer door1;
    ModelRenderer door2;
    ModelRenderer leftDoor;
    ModelRenderer rightDoor;
    ModelRenderer leftWall;
    ModelRenderer rightWall;
    ModelRenderer topBarOutLeft;
    ModelRenderer topBarOutRight;
    ModelRenderer top;
    ModelRenderer bottom;
    ModelRenderer DFront;
    ModelRenderer DBack;
    ModelRenderer DSide1;
	//final int shift = 128;

	public ModelPepperlandShuttleS1() {
		textureWidth = 600;
		textureHeight = 480;

		back = MathTools.part(this, 0, 90, 0, 0, 0, 40, 40, 1, -20F, -32F, 62F , 600, 480);
		front = MathTools.part(this, 0, 0, 0, 0, 0, 40, 42, 4, -20F, -32F, -62f, 600, 480);
        door1 = MathTools.part(this, 90, 0, 0, 0, 0, 1, 36, 8, -19.5F, -25F, -58f, 600, 480);
        door2 = MathTools.part(this, 140, 0, 0, 0, 0, 1, 36, 8, -19.5F, -25F, -50f, 600, 480);
		leftDoor= MathTools.part(this, 90, 0, 0, 0, 0, 1, 36, 8, -19.5F, -25F, 46f, 600, 480);
        rightDoor= MathTools.part(this, 140, 0, 0, 0, 0, 1, 36, 8, -19.5F, -25F, 54f, 600, 480);
        leftWall= MathTools.part(this, 0, 230, 0, 0, 0, 1, 36, 120, 19F, -25F, -58f, 600, 480);
        rightWall=MathTools.part(this, 250, 250, 0, 0, 0, 1, 36, 88, -20F, -25F, -42f, 600, 480);
        topBarOutLeft=MathTools.part(this, 0, 15, 0, 0, 0, 1, 7, 120, 19F, -32F, -58f, 600, 480);
        topBarOutRight=MathTools.part(this, 0, 15, 0, 0, 0, 1, 7, 120, -20F, -32F, -58f, 600, 480);
        top=MathTools.part(this, 125, 0, 0, 0, 0, 38, 1, 120, -19F, -32F, -58F, 600, 480);
        bottom=MathTools.part(this, 125, 0, 0, 0, 0, 38, 1, 120, -19F, 6F, -58F, 600, 480);
		
        textureWidth = 8;
		textureHeight = 4;
		//DBack = MathTools.part(this, 0, 0, 0, 0, -0.8F, 8, 4, 0, -4F, -32F, 216F - shift, 8, 4);

		textureWidth = 38;
		textureHeight = 3;
		DFront = MathTools.part(this, 0, 0, 0, 0, -0.1F, 38, 3, 0, -19F, -29F, -62, 38, 3);
        
        textureWidth = 38;
        textureHeight = 3;
        DBack = MathTools.part(this, 0, 0, 0, 0, -0.1F, 38, 3, 0, -19F, -28F, 64, 38, 3);
      
		textureWidth = 25;
		textureHeight = 6;
		DSide1 = MathTools.part(this, 0, 0, -0.1F, 0, 0, 0, 6, 25, -20, -24F, -40, 25, 6);

		

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
        rightWall.render(f5);
        topBarOutLeft.render(f5);
        topBarOutRight.render(f5);
        top.render(f5);
        bottom.render(f5);
        
		
	}

	public void renderDoors(float f5, float movedoor) {
		
        
        door1.rotateAngleY  = 0.875F * movedoor*3.14f/2f;
        door2.rotateAngleY  = -0.875F * movedoor*3.14f/2f;
        door2.offsetX  = (float)(Math.sin(0.875F*movedoor*3.14f/2f))/2;
        door2.offsetZ = (-1F+(float)Math.cos(0.875F*movedoor*3.14f/2f))/2;

        leftDoor.rotateAngleY  = 0.875F * movedoor*3.14f/2f;
        rightDoor.rotateAngleY  = -0.875F * movedoor*3.14f/2f;
        rightDoor.offsetX  = (float)(Math.sin(0.875F*movedoor*3.14f/2f))/2;
        rightDoor.offsetZ = (-1F+(float)Math.cos(0.875F*movedoor*3.14f/2f))/2;
        

        door1.render(f5);
        door2.render(f5);
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
