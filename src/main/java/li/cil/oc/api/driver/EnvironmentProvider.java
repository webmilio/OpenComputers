package li.cil.oc.api.driver;

import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.item.ItemStack;

/**
 * Environment providers allow OpenComputers to resolve item stacks to the
 * environments generated by the block or item component of the stack.
 * <p/>
 * This is mainly used in OpenComputers' NEI usage handler for displaying
 * a component's API.
 */
public interface EnvironmentProvider {
    /**
     * Get the environment provided by the specified stack.
     * <p/>
     * For blocks this will usually be the tile entity. In particular, for
     * {@link SimpleComponent}s this allows returning
     * an arbitrary class type instead of an environment type, since the
     * {@link Environment} interface will be injected
     * by the class transformer at runtime.
     * <p/>
     * For items this will be the type of the environment returned by the
     * item driver's {@link DriverItem#createEnvironment} method.
     *
     * @param stack the stack to get the environment type for.
     * @return the environment type for the specified stack.
     */
    Class<?> getEnvironment(ItemStack stack);
}
