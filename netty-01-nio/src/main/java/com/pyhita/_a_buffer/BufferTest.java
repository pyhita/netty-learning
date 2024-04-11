package com.pyhita._a_buffer;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * @Author pyhita
 * @Date 2024/4/11
 * @Description
 */
public class BufferTest {


    // 创建Buffer 对象
    @Test
    public void allocateBuffer() {
        // 分配堆内存
        IntBuffer buf1 = IntBuffer.allocate(10);
        // 分配对外内存DirectBuffer
        ByteBuffer buf2 = ByteBuffer.allocateDirect(100);

        System.out.println("buf1 = " + buf1);
        System.out.println("buf2 = " + buf2);
    }
}
