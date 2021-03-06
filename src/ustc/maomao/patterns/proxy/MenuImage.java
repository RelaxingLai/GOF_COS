package ustc.maomao.patterns.proxy;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜品图片
 *      
 */
public interface MenuImage {
     
    /**
     * 显示图片
     * @param iu 回调图片刷新接口
     */
    public void show(ImageUpdater iu);
}
