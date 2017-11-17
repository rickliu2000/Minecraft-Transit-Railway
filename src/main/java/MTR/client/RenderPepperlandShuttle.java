package MTR.client;

import java.io.IOException;
import java.util.stream.IntStream;
import MTR.EntityPepperlandShuttle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPepperlandShuttle extends RenderTrain<EntityPepperlandShuttle> {

	private ModelPepperlandShuttle model = new ModelPepperlandShuttle();
    //private ModelLightRail1 model = new ModelLightRail1();

	public RenderPepperlandShuttle(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPepperlandShuttle entity) {
        int route = entity.getRoute();
        int[] CB = {11};
        int[] JiangNan = {2};
        int[] Argos = {};
        int[] MTR = {};
        boolean isCB = false;
        boolean isJiangNan = false;
        boolean isArogs = false;
        boolean isMTR=false;
        boolean isGPD=false; //bus will wear xx if is true
        boolean p;
        boolean down = route < 0;
        route = Math.abs(route);
        p = route >= 1000;
        if (p)
            route = route - 1000;
        final int compareRoute=route;
        //System.out.println("route "+route);
        isCB = IntStream.of(CB).anyMatch(x -> x == compareRoute);
        isJiangNan = IntStream.of(JiangNan).anyMatch(x -> x == compareRoute);
        ResourceLocation skin = new ResourceLocation("mtr:textures/entity/skins/JiangNanShort.png");
        if (isCB){
            skin = new ResourceLocation("mtr:textures/entity/skins/JiangNanShort.png");
        } else if (isJiangNan){
            skin = new ResourceLocation("mtr:textures/entity/skins/JiangNanShort.png");
        }
        return skin;
	}

	@Override
	protected void render(EntityPepperlandShuttle entity, float leftDoor, float rightDoor) {
		int route = entity.getRoute();
		boolean p;
		boolean down = route < 0;
		route = Math.abs(route);
		p = route >= 1000;
		if (p)
			route = route - 1000;
		ResourceLocation texture2 = getSignTexture(route, p, down ? 2 : 1);
		ResourceLocation texture3 = getSignTexture(route, p, down ? 4 : 3);
		ResourceLocation texture4 = getSignTexture(route, p, down ? 6 : 5);
		ResourceLocation texture5 = getSignTexture(route, p, 7);
       // ResourceLocation texture6 = getSignTexture(route, p, 8);

		model.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		rightDoor = 1 - rightDoor;
		if (rightDoor < 1)
			rightDoor = (float) (-7.9D * Math.pow(rightDoor, 3) + 12.66D * Math.pow(rightDoor, 2) - 5.75D * rightDoor + 1D);
		else
			rightDoor = 0;
		model.renderDoors(0.0625F, rightDoor);
        
		GlStateManager.disableLighting();
		bindTexture(texture2);
		model.renderDisplay1(0.0625F);
		bindTexture(texture3);
		model.renderDisplay2(0.0625F);
		/*bindTexture(texture6);
		model.renderDisplay3(0.0625F);
		bindTexture(texture6);
		model.renderDisplay4(0.0625F);
         */
		GlStateManager.enableLighting();
        
	}

	private ResourceLocation getSignTexture(int route, boolean p, int n) {
		ResourceLocation texture = new ResourceLocation(
				"mtr:textures/displays/bus/bus-" + route + (p ? "P-" : "-") + n + ".png");
		try {
			Minecraft.getMinecraft().getResourceManager().getResource(texture);
		} catch (IOException e) {
			texture = new ResourceLocation("mtr:textures/entity/bus-default-" + n + ".png");
		}
		return texture;
	}
}
